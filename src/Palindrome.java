import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String input = sc.nextLine();
        System.out.println(isPalindrome(input));
        sc.close();
    }
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("\\s+", "").toLowerCase();
        StringBuilder reversed = new StringBuilder(s).reverse();
        return s.equals(reversed.toString());
    }
}