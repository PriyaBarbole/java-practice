import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int  orinum = num;
        int reverse = 0;

        while (num != 0) {
            int div = num % 10;
            reverse = reverse * 10 + div;
            num = num/10;
            }

            if (orinum == reverse) {
                System.out.println("Palindrome");
                }
            else{
                System.out.println("Not a Palindrome");
            }
        sc.close();
    }
    
}
