import java.util.Scanner;

public class FrequencyCA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        char arr[] = str.toCharArray();
        boolean visited[] = new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            if (visited[i])
                continue;
            int count = 1;
            for(int j=i+1;j<arr.length;j++){
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(arr[i] + " = " + count);
        }
        sc.close();
    }
}
