import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            
        int var = scan.nextInt();
        
        if(!(var % 2 == 0)) {
            System.out.println("Weird");
        }
        if( (var % 2 == 0) && (var >= 2 && var <= 5) ) {
            System.out.println("Not Weird");
        }
        if( (var % 2 == 0) && (var >= 6 && var <= 20) ) {
            System.out.println("Weird");
        }
        if( (var % 2 == 0) && (var > 20) ) {
            System.out.println("Not Weird");
        }
        
        scan.close();
    }
}