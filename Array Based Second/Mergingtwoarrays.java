import java.util.Scanner;

public class Mergingtwoarrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of first array: ");
        int n = sc.nextInt();
        int arr1[] = new int[n];

        System.out.println("Enter first array values: ");
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the size of second array: ");
        int m = sc.nextInt();
        int arr2[] = new int[m];

        System.out.println("Enter the values of second array: ");
        for(int i=0;i<m;i++){
            arr2[i] = sc.nextInt();
        }

        int merge[] = new int[n+m];

        for(int i=0;i<n;i++){
            merge[i] = arr1[i];
        }
        for(int i=0;i<m;i++){
            merge[n+i] = arr2[i];
        }

        System.out.println("Merged Array: ");
        for(int i=0;i<n+m; i++)
            System.out.print(merge[i] + " ");
        sc.close();
    }
}
