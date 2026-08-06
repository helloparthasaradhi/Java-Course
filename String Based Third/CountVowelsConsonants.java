import java.util.Scanner;

public class CountVowelsConsonants{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine().toLowerCase();

        int vowles = 0;
        int consonants = 0;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (ch>='a' && ch<='z') {
                if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                vowles++;
            else
                consonants++;
            }
        }
        System.out.println("Vowles: " + vowles);
        System.out.println("Consonants: " + consonants);
        sc.close();
    }
}