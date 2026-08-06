import java.util.Scanner;

public class ReplaceChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str = sc.nextLine();

        System.out.println("Enter a char to be change: ");
        char oldchar = sc.next().charAt(0);
        System.out.println("Enter a new char to replace it with: ");
        char newchar = sc.next().charAt(0);

        str = str.replace(oldchar, newchar);
        System.out.println(str);
        sc.close();
    }
}
