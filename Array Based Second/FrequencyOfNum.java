import java.util.Scanner;

public class FrequencyOfNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array values: ");
        boolean visited[] = new boolean[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        for(int i=0;i<n;i++){
            if(visited[i])
                continue;
            int count = 1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                    visited[j]=true;
                }
            }
            System.out.println(arr[i] + " -> " + count);
        }
        sc.close();
    }
}