import java.util.*; 
import java.io.*;  

class Solution {     
    public static void main(String []argh) {         
        Scanner in = new Scanner(System.in);         
        int t = in.nextInt();  // Number of test cases

        for (int i = 0; i < t; i++) {                 
            int a = in.nextInt();  // First integer
            int b = in.nextInt();  // Second integer
            
            // Example logic: Sum of a and b
            int sum = a + b;
            System.out.println("Case #" + (i + 1) + ": " + sum);
        }                                                                                                                       
        in.close();  // Close the scanner                                                                                                                             
    }      
}
