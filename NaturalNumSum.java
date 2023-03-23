import java.util.Scanner;
public class NaturalNumSum {
    public static void main(String[] args) {
        int sum=0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter final digit num:");
            int n=sc.nextInt();
            for (int i = 1; i <=n; i++) {
                sum = sum+i;
            }
            System.out.println("1 to " + n +" num sum="+sum);
        }
    }
}
