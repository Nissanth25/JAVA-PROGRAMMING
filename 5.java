import java.io.*; 
import java.math.*; 
import java.security.*; 
import java.text.*; 
import java.util.*; 
import java.util.concurrent.*; 
import java.util.regex.*;

public class Solution {  
    public static void main(String[] args) throws IOException {  
        // Initialize BufferedReader for reading input
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); 
        
        // Read a single line of input
        System.out.println("Enter an integer value:");
        String input = bufferedReader.readLine();
        
        // Convert input to an integer
        int value = Integer.parseInt(input);

        // Process and display the result
        System.out.println("You entered: " + value);
        System.out.println("Value incremented by 1: " + (value + 1));

        // Close the BufferedReader
        bufferedReader.close();
    } 
}
