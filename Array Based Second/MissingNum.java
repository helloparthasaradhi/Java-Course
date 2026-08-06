//this will work only when the inputs are starting from 1 to n and it will find only one missing number because the array is -1.
import java.util.Scanner;

public class MissingNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n-1];
        System.out.println("Enter array values: ");
        int sum = 0;
        for(int i=0;i<n-1;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        int total = n * (n+1)/2;
        System.out.println("Missing Number: " + (total - sum));
        sc.close();
    }
}
