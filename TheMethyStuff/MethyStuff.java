package TheMethyStuff;

import TheValidator.InputValidation;

public class MethyStuff {

    private char grade;
    private float percentage;

    /**
     * Calculates the percentage based on the marks provided.
     * Validates the marks before performing the calculation.
     *
     * @param marks The marks obtained by the student.
     */
    public void calculatePercentage(int marks) {
        if (InputValidation.inputValidator(marks)) {
            this.percentage = (marks / 100.0f) * 100;
            calculateGrade(this.percentage);
        } else {
            System.out.println("Invalid marks. Marks must be between 0 and 100.");
        }
    }

    /**
     * Determines the grade based on the percentage.
     *
     * @param percentage The percentage obtained by the student.
     */
    private void calculateGrade(float percentage) {
        if (percentage > 85) {
            this.grade = 'A';
        } else if (percentage > 70) {
            this.grade = 'B';
        } else {
            this.grade = 'C';
        }
    }

    /**
     * Returns the calculated percentage.
     *
     * @return The percentage.
     */
    public float getPercentage() {
        return this.percentage;
    }

    /**
     * Returns the calculated grade.
     *
     * @return The grade.
     */
    public char getGrade() {
        return this.grade;
    }
}
