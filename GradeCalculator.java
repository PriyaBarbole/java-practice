import java.util.Scanner;

public class GradeCalculator {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        if(marks >= 90 && marks >= 100){
             System.out.print("A grade ");
        }

        else if(marks >= 80){
             System.out.print("B grade");
        }

         else if(marks >= 70){
             System.out.print("C grade");
         }

         else if(marks >= 60){
             System.out.print("D grade");
         }

         else{
            System.out.print("Fail");
        }

        sc.close();
    }
    
}
