import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter array values: ");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        System.out.println("which element you want to search ?");
        int key = sc.nextInt();
        boolean found = false;

        for(int i=0;i<n;i++)
            if(arr[i] == key){
                found = true;
                break;
            }
            if (found)
                System.out.println("Found: " + key);
                else
                System.out.println("Number not Found");
            sc.close();
    }
}
