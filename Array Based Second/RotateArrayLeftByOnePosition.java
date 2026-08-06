import java.util.Scanner;

public class RotateArrayLeftByOnePosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array values: ");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int first = arr[0];

        for(int i=0;i<n-1;i++)
            arr[i] = arr[i+1];
        arr[n-1] = first;
        System.out.println("Rotation completed: ");
        for(int x : arr)
            System.out.print(x + " ");

        sc.close();
    }
}
