import java.util.Scanner;

public class ReverseWordsSB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String words[] = str.split(" ");
        StringBuilder sb = new StringBuilder();
        // for(int i=words.length-1;i>=0;i--){     //if we use space option in one line we use this
        //     sb.append(words[i] + " ");         //it will produce an extra space at the end of the string
        // }
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            if (i!=0)                      //where as this would not produce any extra space at the end
                sb.append(" ");
            }
        System.out.println(sb);
            sc.close();
    }
}
