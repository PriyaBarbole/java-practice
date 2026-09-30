import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Digits: ");
        int dig = sc.nextInt();

        int sum = 0;

        while (dig != 0) {
            int num = dig % 10;//get last digit
            sum = sum + num;//add it
            dig = dig/10;//remove last digit
            
        }

        System.out.print("Sum is: " +sum);
    }
    
}
