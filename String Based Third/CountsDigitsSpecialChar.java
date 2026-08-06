import java.util.Scanner;

public class CountsDigitsSpecialChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int Digits = 0;
        int Special = 0;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (ch >='0' && ch <= '9')
                Digits++;
                else if (!(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' || ch == ' '))
                    Special++;
        }
        System.out.println("Digits: " + Digits);
        System.out.println("Special: " + Special);
        sc.close();
    }
}
