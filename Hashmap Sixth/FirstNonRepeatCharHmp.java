import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatCharHmp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (map.get(ch) == 1) {
                System.out.println("First Non-Repeated Character: " + ch);
                sc.close();
                return;
            }
        }
        System.out.println("No Non-Repeated Character");
        sc.close();
    }
}