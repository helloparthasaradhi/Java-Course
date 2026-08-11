import java.util.HashMap;

public class ContainsKey {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('a', 10);
        map.put('b', 20);

        if (map.containsKey('a'))
            System.out.println("'a' is exists" );
            else
            System.out.println("'a' doesn't exists");
    }
}
