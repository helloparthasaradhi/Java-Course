import java.util.Scanner;

public class InsertDeleteReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        System.out.println("Enter a word to append: ");
        sb.append(sc.nextLine());
        System.out.println(sb);
        System.out.println("Enter a word to insert: ");
        sb.insert(4, sc.nextLine());
        System.out.println(sb);
        System.out.println("Enter a word to replace it with: ");
        sb.replace(0, 4, sc.nextLine());
        System.out.println(sb);
        System.out.println("This will delete acc to index given: ");
        sb.delete(0, 5);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sc.close();
    }
}
