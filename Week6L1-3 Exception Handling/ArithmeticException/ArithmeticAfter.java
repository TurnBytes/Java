package ArithmeticException; //it is just package/folder name for exception handling.

public class ArithmeticAfter {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
            e.printStackTrace();
        }
        finally{
            System.out.println("This block will always execute, regardless of the preceding code's outcome.");
        }
    }
}