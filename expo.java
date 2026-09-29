import java.util.Scanner;

public class expo{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter base value: ");
      int base = sc.nextInt();

       System.out.print("Enter Exponent: ");
      int expo = sc.nextInt();

      int Ans = 1;

      for(int i = 1; i <= expo; i++){
        Ans = Ans * base;
      }
      System.out.println("Answer:" +Ans);
    }
}