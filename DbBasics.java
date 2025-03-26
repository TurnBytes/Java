import java.util.Scanner;
import java.sql.*;

class DbBasics {

    public static void main(String[] args) {
        String sName = "";
        int sMarks = 0;
        double totalMarks = 0;

        Scanner sc = new Scanner(System.in);

        try {
            // Establish database connection
            Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Demo",
                "root",
                "" 
            );

            // Create table if not exists
            String createTableQuery = "CREATE TABLE IF NOT EXISTS student_marks (" +
                                       "id INT AUTO_INCREMENT PRIMARY KEY, " +
                                       "subject VARCHAR(255), " +
                                       "marks INT)";
            Statement stmt = connection.createStatement();
            stmt.execute(createTableQuery);

            // Insert data into the database
            for (int i = 0; i < 2; i++) {
                System.out.println("Enter Subject Name:");
                sName = sc.nextLine();

                System.out.println("Enter Marks for " + sName + ":");
                sMarks = sc.nextInt();
                sc.nextLine();

                totalMarks += sMarks;

                String insertQuery = "INSERT INTO student_marks (subject, marks) VALUES (?, ?)";
                PreparedStatement pstmt = connection.prepareStatement(insertQuery);
                pstmt.setString(1, sName);
                pstmt.setInt(2, sMarks);
                pstmt.executeUpdate();
            }

            // Retrieve data from the database
            System.out.println("--------------Govt Degree College Lal--------------");
            System.out.println("---------------DMC---------------------------------");
            System.out.println("Subject------------------------------------------------Marks");
            System.out.println("");
            String selectQuery = "SELECT subject, marks FROM student_marks WHERE subject=\"Java\"";
            ResultSet rs = stmt.executeQuery(selectQuery);

            while (rs.next()) {
                String subjectName = rs.getString("subject");
                int marks = rs.getInt("marks");
                System.out.println(subjectName + "------------------------------------------------" + marks);
            }

            // Calculate and display total and percentage
            System.out.println("Total------------------------------------------------" + totalMarks);
            double per = totalMarks / 200 * 100;
            System.out.println("Percentage------------------------------------------------" + per + "%");

            char[] grade = {'A', 'B', 'C'};
            if (per >= 90) {
                System.out.println("Grade------------------------------------------------" + grade[0]);
            } else if (per >= 70) {
                System.out.println("Grade------------------------------------------------" + grade[1]);
            } else {
                System.out.println("Grade------------------------------------------------" + grade[2]);
            }

            // Close resources
            rs.close();
            stmt.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}