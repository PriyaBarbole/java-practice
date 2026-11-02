import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Digits: ");
        int num = sc.nextInt();

      //Finding the last digit
        int last = num % 10;
       
     //Creating temporary variables
        int temp = num;
        int first = 0;
        int divisor = 1;

        while (temp >= 10) {
            temp = temp / 10;
            divisor = divisor*10;
            }

        first = temp;
         int middle = (num % divisor) / 10;

        int result = last * divisor + middle * 10 + first;

        System.out.println("Swapped number: " + result);
    }
    
}
