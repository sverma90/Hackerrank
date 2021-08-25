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

        try{
            String S = bufferedReader.readLine();
                    
            if(S.matches(".*\\d.*")) {
                int var = Integer.parseInt(S);
                System.out.println(S);
            }else {
                System.out.println("Bad String");
            }
        }
        catch(Exception e){
            System.out.println("Bad String");
        }

        bufferedReader.close();
    }
}