import java.util.Scanner;
public class Delhi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int D = sc.nextInt();
        int X = sc.nextInt();
        int totalFine = 0;
        for (int i = 0; i < N; i++) {
            if (D % 2 == 0) {
                if (a[i] % 2 != 0) {
                    totalFine += X;
                }
            }
            else {
                if (a[i] % 2 == 0) {
                    totalFine += X;
                }
            }
        }
        System.out.println(totalFine);
        sc.close();
    }
}