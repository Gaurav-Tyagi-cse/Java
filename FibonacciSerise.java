import java.util.Scanner;
public class FibonacciSerise {
 public static void main(String[] args)
 {
    try (Scanner sc = new Scanner(System.in)) {
        int first=0;
        int second=1;
        int third;
        System.out.print("Enter last num of Fabonacci serise==");
        int num=sc.nextInt();
        for(int i=3;i<=num;i++)
        {
            third=first+second;
            first=second;
            second=third;
            System.out.print(third+",");
        }
    }
 }   
}
