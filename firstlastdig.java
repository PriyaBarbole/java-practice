import java.util.Scanner;

public class firstlastdig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.println("Enter your number: ");
       int num = sc.nextInt();

       int last = num % 10;

       while (num >= 10) {
        num = num/10;
        }

        System.out.println("First digit is: " + num);
        System.out.println("Last digit is: " + last);

        sc.close();
    }
    
}
