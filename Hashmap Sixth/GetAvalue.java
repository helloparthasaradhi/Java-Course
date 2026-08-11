import java.util.HashMap;

public class GetAvalue {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('a', 10);
        map.put('b', 20);
        System.out.println(map.get('a'));
        System.out.println(map.get('b'));
    }
}
