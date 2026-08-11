import java.util.HashMap;
import java.util.Scanner;

public class CountWordsHmp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String words[] = str.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0;i<words.length;i++){
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        } 
        for(String word : map.keySet()){
            System.out.println(word + " = " + map.get(word));
        }
        sc.close();
    }
}
