import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        String words[] = str.split(" ");
        System.out.println("The reversed string: ");
        for(int i=words.length-1;i>=0;i--)
            System.out.print(words[i] + " ");      //this will create an extra space at the end of the string
        sc.close();                               //we will learn effecient code in the StringBuilder concept
    }
}
