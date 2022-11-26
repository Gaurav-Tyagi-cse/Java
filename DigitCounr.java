public class DigitCount {
   static void countDigit(int num, int count){
    //Termination case
    if (num == 0) {
        System.out.println("Count is "+ count);
        return ;
    }
       //Small Problem
        num = num/10;  // Make Number Small
        count = count + 1;
        countDigit(num, count); //Recursion
  
        
    }
    public static void main(String[] args) {
        int num = 123456;
        countDigit(num,0);
    }
}
