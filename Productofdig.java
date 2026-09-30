import java.util.Scanner;

public class Productofdig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Digits: ");
        int num = sc.nextInt();

        int pro = 1;

        while (num != 0) {
            int dig = num % 10;
            pro = pro * dig;
            num = num/10;
        }

        System.out.print("Product of digits: " +pro);
    }
    
}
