import java.util.*;

public class Prime_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be checked: ");
        int n = sc.nextInt();
        boolean isPrime = true;
        if(n<2)
            isPrime = false;
        for(int i = 2; i*i<=n; i++){
            if(n%i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime)
            System.out.println(n + " is a prime number.");
        else
            System.out.println(n + " is not a prime number.");
        sc.close();
    }
}
