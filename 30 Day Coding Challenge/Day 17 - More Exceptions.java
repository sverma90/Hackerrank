import java.util.*;
import java.io.*;

//Write your code here
class Calculator {
    public int power(int n, int p) throws Exception {        
        if(n > 0 && p > 0) {
            return (int) Math.pow(n, p);
        }else if(n != 0 && p == 0){
            return 1; 
        }else if(n == 0 && p != 0){
            return 0; 
        }else {
            throw new IllegalStateException("n and p should be non-negative");
            // Source: https://stackoverflow.com/questions/28946291/how-to-return-string-and-int-type-in-a-method?noredirect=1&lq=1
        }
    }
}

class Solution{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}