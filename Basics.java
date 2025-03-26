import java.util.Scanner;


class Basics {

    public static void main(String [] args){

        String sName = "";
        int sMarks = 0;
        double totalMarks=0;
        

        String [] subjectNameArray = {null,null};
        int [] subjectMarksArray = {0,0};

        char [] grade = {'A','B','C'};
        

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<2;i++){

            System.out.println("Babo Sb Subject Enter");
            sName = sc.nextLine();
            subjectNameArray[i] = sName;
    
            System.out.println("Babo Sb Marks Enter da "+sName);
            sMarks = sc.nextInt();
            subjectMarksArray[i] = sMarks;

            totalMarks += sMarks;
            sc.nextLine();
            
        }
        sc.close();
        
        System.out.println("--------------Govt Degree College Lal--------------");
        System.out.println("---------------DMC---------------------------------");
        System.out.println("Subject------------------------------------------------Marks");
        for(int j=0;j<subjectMarksArray.length;j++){

            System.out.println(subjectNameArray[j] + "------------------------------------------------"+subjectMarksArray[j]);
        }
        System.out.println("Total------------------------------------------------"+totalMarks);
        double per = totalMarks/200*100;
        System.out.println("Percentage------------------------------------------------"+per+"%");
        if(per>=90){

            System.out.println("Grade------------------------------------------------"+grade[0]+"%");
        }
        else if(per>=70){
            System.out.println("Grade------------------------------------------------"+grade[1]+"%");
        }
        else{
            System.out.println("Grade------------------------------------------------"+grade[2]);
        }

        


    
    }
}
