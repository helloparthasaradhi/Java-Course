import java.util.Scanner;

public class CompareTwoStringCA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter second string: ");
        String str2 = sc.nextLine();

        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        if (arr1.length != arr2.length) {
            System.out.println("Not Equal");
        }
        else{
        boolean equal = true;
        for(int i=0;i<arr1.length;i++){
            if (arr1[i] != arr2[i]) {
                equal = false;
                break;
            }
        }
        if (equal)
            System.out.println("Equal");
            else
                System.out.println("Not Equal");
        }
            sc.close();
    }
}
