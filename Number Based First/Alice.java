import java.util.*;
public class Alice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] D = new int[N];
        for (int i = 0; i < N; i++) {
            D[i] = sc.nextInt();
        }
        int lastDigit = D[N - 1];
        int correct = 0;
        for (int i = 0; i < N; i++) {
            if (D[i] == lastDigit) {
                correct++;
            }
        }
        int incorrect = N - correct;
        System.out.println(incorrect);
        sc.close();
    }
}