import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        int count = 0, num = 0;;
        
        char[] var = Integer.toBinaryString(n).toCharArray();

        for(int i = 0; i < var.length; i++){
            count = (var[i] == '0') ? 0 : count + 1; 
            if(count > num){
                num = count;
            }
        }
        System.out.println(num);  
    }
}