package ArrayIndexOutOfBoundsException; //it is just package/folder.

public class ArrayBefore {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(arr[5]); // Will crash due to invalid index
    }
}
