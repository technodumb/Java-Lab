import java.util.Scanner;

public class SortString {
    public static void main(String args[]){
        Scanner sci = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);
        System.out.print("Enter the no of strings to be sorted: ");
        int n = sci.nextInt();
        String[] str = new String[n];
        System.out.println("Enter the strings: ");
        for(int i=0; i<n; i++){
            str[i] = scs.nextLine();
        }
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(str[i].compareTo(str[j])>0){
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.println("Sorted strings: ");
        for(int i=0; i<n; i++){
            System.out.println(str[i]);
        }
        sci.close();
        scs.close();
    }
}
