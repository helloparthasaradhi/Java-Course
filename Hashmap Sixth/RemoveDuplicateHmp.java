import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicateHmp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        String result = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (!set.contains(ch)) {
                set.add(ch);
                result += ch;
            }
        }
        System.out.println(result);
        sc.close();
    }
}
