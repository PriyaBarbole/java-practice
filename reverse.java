import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        //we haven't reversed yet so we'll start with reverse = 0
        int reverse = 0;

        while (num != 0) {
            //The % operator gives the remainder
            int digit = num % 10;
            //Put the digit into reverse
            reverse = reverse * 10 + digit;
            //Remove the last digit from num
            num = num/10;
        }
        System.out.println("Reverse: " +reverse);

        sc.close();
    }
    
}
