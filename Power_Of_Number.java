import java.util.Scanner;
public class Power_Of_Number {
  
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter Base of value");
        int value = sc.nextInt();
        int result=1;
        System.out.println("Enter power of value");
        int power = sc.nextInt();
        for (int i = 1; i <= power; i++) {
             result = value * result;
        }
        System.out.println(value+"^"+power+ "=" +result);
    }
}
}