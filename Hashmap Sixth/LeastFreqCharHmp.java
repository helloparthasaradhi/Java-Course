import java.util.HashMap;
import java.util.Scanner;

public class LeastFreqCharHmp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        char least = str.charAt(0);
        int min = map.get(least);
        for(char ch : map.keySet()){
            if (map.get(ch) < min) {
                min = map.get(ch);
                least = ch;
            }
        }
        System.out.println("Least Frequency Character: " + least + " -> " + min + " Times");
        sc.close();
    }
}
