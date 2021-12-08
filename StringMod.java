import java.util.Scanner;

public class StringMod {
    public static void main(String args[]) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        // menu driven program to 
        // insert a string in another string at a given position
        // modify character at a given position
        // append a string
        int choice;
        System.out.print("Enter a string: ");
        StringBuffer str1 = new StringBuffer(sc1.nextLine());
        do{
            System.out.println("\n\n\n\nMENU");
            System.out.println("1. Insert a string in another string at a given position");
            System.out.println("2. Modify character at a given position");
            System.out.println("3. Append a string");
            System.out.println("4. Exit");
            System.out.println("Enter your choice");
            choice = sc1.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter a string to be inserted: ");
                    String str2 = sc2.nextLine();
                    System.out.print("Enter the position: ");
                    int pos = sc2.nextInt();
                    str1.insert(pos, str2);
                    System.out.println("String after insertion: " + str1);
                    break;
                case 2:
                    System.out.print("Enter the position: ");
                    pos = sc2.nextInt();
                    System.out.print("Enter the character: ");
                    char ch = sc2.next().charAt(0);
                    str1.setCharAt(pos+1, ch);
                    System.out.println("String after modification: " + str1);
                    break;
                case 3:
                    System.out.print("Enter a string to be appended: ");
                    str2 = sc2.nextLine();
                    str1.append(str2);
                    System.out.println("String after appending: " + str1);
                    break;
                case 4:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid choice");
        }
        }while(choice != 4);
        sc1.close();
        sc2.close();
    }
}
