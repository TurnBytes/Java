
package TheValidator;

public class InputValidation {
    
    public static boolean inputValidator(int marks)//made static--will ab available without object creation
    {
        if(marks>100 || marks<0){
            return false;
        }
        else{
            return true;
        }
    }
}
