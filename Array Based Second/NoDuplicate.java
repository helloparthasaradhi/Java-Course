import java.util.Scanner;

public class NoDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter array values: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Unique values: ");
        for(int i=0;i<n;i++){
            boolean found = false;
            for(int j=0;j<i;j++){
                if (arr[i]==arr[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}
