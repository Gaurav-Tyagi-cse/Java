public class Subtract  {
    public static void main(String[] args) {
        int first[] = {9,2,4,5};
        int second[] = {4,5,7,9};
        int result[] = new int[first.length > second.length ? first.length : second.length];
        int i = first.length - 1;
        int j = second.length - 1;
        int k = result.length - 1;
        int carry = 0;
        int sub = 0;
        while(k >= 0) {
            if(i >= 0 && j >= 0) {
                sub = first[i] - second[j] + carry;
            }
            else if(i >= 0 && j < 0) {
                sub = first[i] - carry;
            }
            else if(i < 0 && j >= 0) {
                sub = second[j] - carry;
            }
            
            carry = sub/10;
            sub = sub % 10;
            result[k] = sub;
            i--;
            j--;
            k--;
        }
        if(carry != 0) {
            System.out.print(carry);
        }
        for(int e : result) {
            System.out.print(e);
        }
    }
}
