import java.io.*; 
import java.math.*; 
import java.security.*; 
import java.text.*; 
import java.util.*; 
import java.util.concurrent.*; 
import java.util.regex.*;

public class Solution {  
    public static void main(String[] args) throws IOException {  
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
        
        // Reading input
        System.out.println("Enter three integers separated by spaces:");
        String[] input = reader.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        // Example logic: Calculate sum and product
        int sum = a + b + c;
        int product = a * b * c;

        // Output results
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }  
}
