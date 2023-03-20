import java.util.Scanner;

public class PrimeNumber
 {
   public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        int n,i,count=0;
        do
        {
        System.out.println("Enter any number:");
        n=sc.nextInt();
        
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
            System.out.println("your number is prime:");
        else
        System.out.println("your number is not prime:");
    }while(i!=0);
    }
   } 
 }