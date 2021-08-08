import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int array[] = new int[3]; 
        
        for(int i = 0; i <= 2; i++) {
            array[i] = scan.nextInt();
        }
        
        for (int j=0; j <= 2; j++) {
            System.out.println(array[j]);
        }        
    }
}