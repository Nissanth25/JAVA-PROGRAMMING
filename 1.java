import java.util.*;  

public class Solution {  
    public static void main(String[] args) {     
        Scanner scan = new Scanner(System.in);         
        int a = scan.nextInt();             
        int b = scan.nextInt();                 
        int c = scan.nextInt();                     

        int sum = a + b + c;
        int product = a * b * c; 
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    } 
}
