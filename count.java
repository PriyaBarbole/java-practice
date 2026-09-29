import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        //Take input from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number: "); 
        int num = sc.nextInt();

        // assigning the value for counting digits 
        int a = 0;
        
        //used while condition 
        while (num != 0) {
            a++;
        num = num/10; 

        }

        System.out.println("Count is: " +a);

    sc.close();
    }
    
}
