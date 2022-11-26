/*Pattern program 
 _____output____
   *
   **
   ***
   ****
   *****
*/
public class Pattern1_Recursion {  
        static void printPattern(int currentRow) {
            if(currentRow == 0) {
                return;
            }
            System.out.print("*");
            printPattern(currentRow-1);
        }
    
        static void pattern(int row, int currentRow) {
            if(row == 0) {
                return;
            }
            printPattern(currentRow);
            System.out.println();
            pattern(row-1, currentRow+1);
        }
    
        public static void main(String[] args) {
            pattern(5, 1);
        }
    }