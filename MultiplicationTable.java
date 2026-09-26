import java.util.Scanner;

public class MultiplicationTable {
    public static void main (String [] args){
     Scanner sc = new Scanner (System.in);

     System.out.println("Enter your number:");
     int sum = sc.nextInt();
     
     for(int i = 1; i <= 10; i++){


        System.out.println(sum + "x" + sum + "=" + sum * i);

     }

     sc.close();
    }
    
}
