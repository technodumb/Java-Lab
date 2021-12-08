import java.util.Scanner;

public class Frequency {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();
        System.out.print("Enter the character to be found: ");
        char ch = sc.next().toLowerCase().charAt(0);
        int count = 0;
        for (char i:str.toCharArray()) {
            if (i == ch) {
                count++;
            }
        }
        System.out.println("The character " + ch + " occurs " + count + " times in the string " + str);
        sc.close();
    }
}
