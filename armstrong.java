import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Digits: ");
        int num = sc.nextInt();

        int temp = num;
        int count = 0;
        int sum = 0;

        while(temp > 0){
            temp=temp/10;
            count++;
        }
        System.out.println("Count: " +count);
    
       temp = num;
       while (temp > 0) {
        int digit= temp % 10;
        sum= sum+ (int)Math.pow(digit, count);
        temp=temp/10;
        }
     if (sum == num){
        System.out.println("Armstrong number");
     }else {
        System.out.println("Not an Armstrong Number");
     }

        sc.close();
    }
    
}
