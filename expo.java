import java.util.Scanner;

public class expo {
public static void main(String[] args) {
    //inputing values
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter value: ");
    int base = sc.nextInt();

    System.out.println("Enter expo: ");
    int expo = sc.nextInt();

    //Creating new updating variable
    int n = 1;

    //creating loop for exponent(iteration)
    for(int i = 1; i <= expo; i++){
        n = n * base;
    }
    System.out.println("Answer: " + n);
}
    
}