package ArrayIndexOutOfBoundsException; //it is just package/folder name where this java file is located

public class ArrayAfter {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index!");
            e.printStackTrace();
        }
        finally{
            System.out.println("This block will always execute, regardless of the preceding code's outcome.");
        }
        
    }
}
