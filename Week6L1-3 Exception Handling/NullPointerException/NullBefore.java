package NullPointerException; //it is just package/folder name for this java file.

public class NullBefore {
    public static void main(String[] args) {
        String str = null;
        System.out.println(str.length()); // Will crash due to null reference
    }
}