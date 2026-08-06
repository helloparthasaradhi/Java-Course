import java.util.Scanner;

public class CompareTwoStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String s1 = sc.nextLine().toLowerCase();
        System.out.println("Enter second word: ");
        String s2 = sc.nextLine().toLowerCase();

        if(s1.equals(s2))
            System.out.println("These strings are equal");
        else
            System.out.println("These strings are not equal");
        sc.close();
    }
}
