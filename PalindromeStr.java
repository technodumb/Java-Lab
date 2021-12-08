import java.util.Scanner;

public class PalindromeStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        int len = str.length();
        boolean palindrome = true;
        for(int i = 0; i<len/2; i++) {
            if(str.charAt(i) != str.charAt(len-i-1)){
                palindrome = false;
                break;
            }
        }
        if (palindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        sc.close();
    }
}
