import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int fact=1;
            System.out.print("Enter your number:");
            int n=sc.nextInt();
            for(int i=1;i<=n;i++)
            {
                fact=fact*i;
            }
            System.out.println("your num factorial:"+fact);
        }
    }
}
