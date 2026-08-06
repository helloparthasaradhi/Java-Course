import java.util.Scanner;
public class Armstrongnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;

        while (n>0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }
        if (sum == temp)
            System.out.println("It is Armstrong No.");
            else
                System.out.println("It is not Armstrong No.");
        
        sc.close();
    }
}
