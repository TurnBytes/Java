import java.util.InputMismatchException;
import java.util.Scanner;

import TheMethyStuff.MethyStuff;
import TheValidator.InputValidation;

public class BestPractices {

    private String subjectName;
    private int marks;

    public static void main(String[] args) {
        BestPractices app = new BestPractices();
        app.run();
    }

    public void run() {
        MethyStuff maths = new MethyStuff();
        Scanner scanner = new Scanner(System.in);

        try {
            // Collect subject name
            subjectName = getSubjectName(scanner);

            // Collect and validate marks
            marks = getValidMarks(scanner);

            // Calculate percentage and grade
            maths.calculatePercentage(marks);
            System.out.println("Subject: " + subjectName);
            System.out.println("Marks: " + marks);
            System.out.println("Percentage: " + maths.getPercentage() + " %");
            System.out.println("Grade: " + maths.getGrade());
        } finally {
            scanner.close(); // Ensure the scanner is closed
        }
    }

    /**
     * Collects the subject name from the user.
     * Ensures the input is a valid string (no numbers or special characters).
     *
     * @param scanner The scanner object for input.
     * @return The valid subject name entered by the user.
     */
    private String getSubjectName(Scanner scanner) {
        String subjectName;
        boolean isValidInput = false;

        do {
            System.out.print("Enter Subject Name: ");
            subjectName = scanner.nextLine();

            // Validate subject name using a regular expression
            if (subjectName.matches("[a-zA-Z ]+")) {
                isValidInput = true; // Input is valid
            } else {
                System.out.println("Invalid input. Subject name should only contain letters and spaces. Please try again.");
            }
        } while (!isValidInput);

        return subjectName;
    }

    /**
     * Collects and validates the marks entered by the user.
     * Handles invalid input and ensures marks are within the valid range.
     *
     * @param scanner The scanner object for input.
     * @return The valid marks entered by the user.
     */
    private int getValidMarks(Scanner scanner) {
        int validMarks = 0;
        boolean isValidInput = false;

        while (!isValidInput) {
            try {
                System.out.print("Enter Marks for " + subjectName + ": ");
                validMarks = scanner.nextInt();

                // Validate marks using InputValidation
                if (InputValidation.inputValidator(validMarks)) {
                    isValidInput = true; // Exit loop if input is valid
                } else {
                    System.out.println("Marks must be between 0 and 100. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer value.");
                scanner.nextLine(); // Clear invalid input
            }
        }

        return validMarks;
    }
}
