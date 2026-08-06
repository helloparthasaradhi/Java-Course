import java.util.Scanner;

public class Sumofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        // System.out.println("Enter array elements: ");       //no need of creating extra loop here 
        // for(int i=0;i<n;i++)
        //     arr[i] = sc.nextInt();

        int sum = 0;
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        sum += arr[i];
        }
        System.out.println("Sum: " + sum);
        sc.close();
    }
}
