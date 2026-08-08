import java.util.Scanner;

public class DuplicateCA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        char arr[] = str.toCharArray();
        String result = "";

        for(int i=0;i<arr.length;i++){
            boolean duplicate = false;
            for(int j=0;j<result.length();j++){
                if (arr[i] == result.charAt(j)) {
                    duplicate = true;
                    break;
                }
            }
            if(!duplicate)
                result += arr[i];
        }
        System.out.println(result);
        sc.close();
    }
}
