import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        System.out.println("No Of Letters: " + str.length());
        sc.close();
    }
}
