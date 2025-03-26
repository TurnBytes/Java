import java.util.InputMismatchException;
import java.util.Scanner;

import TheMethyStuff.*;
//import TheValidator.*;
import TheValidator.InputValidation;


public class BestPractices {
    
    public String SubjectName;
    public int Marks;
    //public char Grade;
    

  


    public static void main(String[] args) {

        BestPractices std = new BestPractices();
        MethyStuff maths = new MethyStuff();//
        InputValidation valid = new InputValidation();
        //maths.CalculatePercentage(100);
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Suject: ");
        std.SubjectName = sc.nextLine();

        boolean flag = false;
        while (true) {
            
            try{
                if(flag)
                {
                    System.out.println("Enter "+std.SubjectName+" Again");
                }
                else{
                    System.out.println( "Enter "+std.SubjectName+" Marks");
                }
    
                
                std.Marks = sc.nextInt();
                if(std.Marks > 100){
                    System.out.println("Pleae Enter Integer Only & Integer Must be equal to 0 or greater");
                    flag = true;
                    continue;
                }
            sc.close();
            maths.CalculatePercentage(std.Marks);
            System.out.println(std.SubjectName+" Grade: "+maths.Grade);
            break;
            }catch(InputMismatchException e){
                System.out.println(e.getMessage());
            }
        }

        //System.out.println("After Exception");

        //std.CalculatePercentage(std.Marks);
        //System.out.println(std.Grade);


        //System.out.println(std.CalculatePercentage(100));
    }
}
