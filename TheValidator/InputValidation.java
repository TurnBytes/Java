
package TheValidator;

public class InputValidation {
    
    public static boolean inputValidator(int marks)
    {
        if(marks>100 || marks<0){
            return false;
        }
        else{
            return true;
        }
    }
}
