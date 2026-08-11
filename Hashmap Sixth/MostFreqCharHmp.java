import java.util.HashMap;
import java.util.Scanner;

public class MostFreqCharHmp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        char most = str.charAt(0);
        int max = map.get(most);
        for(char ch : map.keySet()){
            if (map.get(ch) > max) {
                max = map.get(ch);
                most = ch;
            }
        }
        System.out.println("Most Frequent Character: " + most + " -> " + max + " Times");
        sc.close();
    }
}
