// Question Link :- https://www.hackerrank.com/challenges/java-string-reverse/problem

// Solution :-
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Read input 
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();
        
        //  Reverse string and compare to original 
        //  If a String is equivalent to itself when reversed, it's a palindrome 
        
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(reversed) ? "Yes" : "No");
    }
}

