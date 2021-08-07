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

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
            sb.append(arrItem).append(" ");
        }
        sb.setLength(sb.length());
        String display = sb.toString();
        
        for (int i = arr.size() - 1; i >= 0 ; i--) {
            System.out.print(arr.get(i) + " ");
        }

        bufferedReader.close();
    }
}
