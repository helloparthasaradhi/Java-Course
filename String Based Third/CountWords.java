import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentense: ");
        String str = sc.nextLine().trim();

        if (str.length()==0) {
            System.out.println("Words = 0");
        }
        else{
        int count = 1;

        for(int i=0;i<str.length();i++){
            if (str.charAt(i)==' ') 
            count++;
        }
        System.out.println("words: " + count);
        sc.close();
        }
    }
}
