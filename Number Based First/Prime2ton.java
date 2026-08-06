import java.util.Scanner;

public class Prime2ton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        
        for(int num=2; num <= n; num++){
            boolean prime = true;

            for(int i=2; i<=num/2; i++){
                if (num%i==0) {
                    prime = false;
                    break;
                }
            }
            if (prime)
                System.out.println(num + " ");
            sc.close();
        }
    }
}
