import java.util.Scanner;

public class firstlastdig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your digits: ");
        int num = sc.nextInt();

        int last = num % 10; 

        while (num >= 10) {
            num = num/10;
        }

        int first = num;
        System.out.println("First num: " +first);
        System.out.print("Last num: " +last);
    }
    
}
