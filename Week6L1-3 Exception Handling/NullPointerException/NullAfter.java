package NullPointerException;

public class NullAfter {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Error: Null reference detected!");
            e.printStackTrace();
        }
        finally{
            System.out.println("This block will always execute, regardless of the preceding code's outcome.");
        }
    }
}
