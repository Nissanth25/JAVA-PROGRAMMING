import java.util.*; 
import java.io.*;  

class Solution {     
    public static void main(String []argh) {         
        Scanner in = new Scanner(System.in);         
        int t = in.nextInt();  

        for (int i = 0; i < t; i++) {                 
            int a = in.nextInt();  
            int b = in.nextInt(); 
            
            int sum = a + b;
            System.out.println("Case #" + (i + 1) + ": " + sum);
        }                                                                                                                       
        in.close(); 
    }      
}
