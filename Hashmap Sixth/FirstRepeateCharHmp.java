import java.util.HashSet;
import java.util.Scanner;

public class FirstRepeateCharHmp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine().toLowerCase();
        HashSet<Character> map = new HashSet<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (map.contains(ch)) {
                System.out.println("First repeeted character: " + ch);
                sc.close();
                return;
            }
            map.add(ch);
        }
        System.out.println("There is no repeated character in the string");
        sc.close();
    }
}
