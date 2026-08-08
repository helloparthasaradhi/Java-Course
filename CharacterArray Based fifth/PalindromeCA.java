import java.util.Scanner;

public class PalindromeCA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        char arr[] = str.toCharArray();

        int left = 0;
        int right = arr.length-1;

        boolean palindrome = true;

        while (left<right) {
            if (arr[left] != arr[right]) {
                palindrome = false;
                break;
            }
            left++;
            right--;
        }
        if(palindrome)
            System.out.println("Palindrome");
        else
            System.out.println("It is not a palindrome");
        sc.close();
    }
}
