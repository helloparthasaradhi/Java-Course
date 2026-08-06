import java.util.Scanner;

public class Countsnoofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long n = sc.nextLong();
        int count = 0;

        while (n>0) {
            count++;
            n /= 10;
        }
        System.out.println(count);
        sc.close();
    }
}
