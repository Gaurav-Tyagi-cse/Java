import java.util.Scanner;
class Discount{
    public static void main(String[] args)
    {
        // Write your code here
      Scanner ac = new Scanner(System.in);
      int am=ac.nextInt();
      double dis;
      if(am<1000){
        dis=0.0;
      }
      else if(am>1000&&am<5000)
      {
        dis = 0.05;
      }
      else if(am>5000 && am<10000)
      {
        dis = 0.1;
      }
      else if(am> 10000)
      {
        dis = 0.15;
      }
       if(am>30000){
        dis=+0.02;
      }
      String n = am - dis * am;
      System.out.printf("%.2f",n);
      doublese();
    }
}