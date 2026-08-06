import java.util.Scanner;

public class RotateArrayRightByOnePosotion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array values: ");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int last = arr[n-1];
        for(int i=n-1;i>0;i--)
            arr[i] = arr[i-1];
        arr[0] = last;

        for(int x : arr)
            System.out.print(x + " ");
        sc.close();
    }
}
