import java.util.Scanner;
class Reverse{
    public static void main(String[] args)
    {
        Scanner ac = new Scanner(System.in);
        System.out.print("Enter any value:");
        int n = ac.nextInt();
        int rev = 0;
        for(int i=n; n!=0; n=n/10)
        {
          rev = n % 10;
          if(rev==0)
          {
            
          }
          else{
            System.out.print(rev);
          }
        }
      
          
    }
}