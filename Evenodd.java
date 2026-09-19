import java.util.Scanner;

public class Evenodd {
    public static void main(String [] args){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your number:");
    int a = sc.nextInt();

    if(a % 2 == 0){
        System.out.println("Number is Even.");
    }
    else{
         System.out.println("Number is odd.");
    }
 
    sc.close();

    }
    
}
