import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        
        try{
            long num = Integer.parseInt(n);
            System.out.println(isPrime(num));
        } catch(NumberFormatException ex){ 
            BigInteger b = new BigInteger(String.valueOf(n));
            if(b.isProbablePrime(1) == false){
                System.out.println("not prime");
            }else {
                System.out.println("prime");
            }
        }  

        bufferedReader.close();
    }
    
    public static String isPrime(long num) {
        float sqrt = (int) Math.sqrt(num) + 1;
        
        if (num == 0 || num == 1) {
            return "not prime";
        }
        
        for (int i = 2; i < sqrt; i++) {
            if (num % i == 0)
                return "not prime";
        }
        return "prime";
    }
}