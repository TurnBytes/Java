package TheMethyStuff;
import TheValidator.InputValidation;


public class MethyStuff {

    public char Grade;
    public int marks;
    
    public void CalculatePercentage(int marks){
        
        if(InputValidation.inputValidator(marks)){
            
            float percentage = (float)marks/100*100;
            CalculateGrade(percentage);
            System.out.println("Percentage: "+  percentage);
        }
        else {
            System.out.println("Invalid Input");
        }
        
    }

    public void CalculateGrade(float percentage){
        if(percentage>85){
            Grade = 'A';
        }
        else if(percentage>70){
            Grade = 'B';
        }
        else{
            Grade = 'C';
        }
    }

}
