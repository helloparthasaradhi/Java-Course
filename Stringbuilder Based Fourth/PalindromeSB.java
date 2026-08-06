import java.util.Scanner;

public class PalindromeSB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        StringBuilder sb = new StringBuilder(str);
        String rev = sb.reverse().toString();
        if (str.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
        sc.close();
    }
}
