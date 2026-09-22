import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String [] args){
 
Scanner sc = new Scanner(System.in);

System.out.print("Enter 1st number: ");
int a = sc.nextInt();

System.out.print("Enter 2nd number: ");
int b = sc.nextInt();

if(a > b){
    System.out.print("A Is greater");
}
else if(b > a){
    System.out.print("B Is greater");
}
else{
    System.out.print("Both are equal");
}
sc.close();
    }
    
}
