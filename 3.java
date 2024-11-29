import java.util.Scanner;  

public class Solution {  
    public static void main(String[] args) {     
        Scanner scan = new Scanner(System.in);                  
        
        // Reading inputs
        int i = Integer.parseInt(scan.nextLine());  // Read an integer
        double d = Double.parseDouble(scan.nextLine());  // Read a double
        String s = scan.nextLine();  // Read a string (remaining input)
        
        // Output results
        System.out.println("Integer: " + i);
        System.out.println("Double: " + d);
        System.out.println("String: " + s);
    }  
}
