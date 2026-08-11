import java.util.*;

public class FrequencySeparatelyHmp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(char ch : map.keySet()){
            System.out.println(ch + " = " + map.get(ch));
        }
        sc.close();
    }
}
