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
        
        System.out.println("Enter an integer value:");
        String input = bufferedReader.readLine();
        
        int value = Integer.parseInt(input);

        System.out.println("You entered: " + value);
        System.out.println("Value incremented by 1: " + (value + 1));

        bufferedReader.close();
    } 
}
