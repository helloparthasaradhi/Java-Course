import java.security.SecureRandom;
import java.util.Scanner;

public class Otpgenerator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SecureRandom num = new SecureRandom();
        
        System.out.println("Enter OTP Length: ");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.print(num.nextInt(10));
            sc.close();
            
        }
    }
}
