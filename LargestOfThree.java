import java.util.Scanner;

public class LargestOfThree {
    public static void main(String [] args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter 1st number: ");
int a = sc.nextInt();

System.out.print("Enter 2nd number: ");
int b = sc.nextInt();

System.out.print("Enter 3rd number: ");
int c = sc.nextInt();

if(a >= b && a >= c){
    System.out.print("Largest number is: " +a);
}

else if(b >= a && b >= c){
    System.out.print("Largest number is: " +b);
}

else{
    System.out.print("Largest number is: " +c);
}

sc.close();

    }
    
}
