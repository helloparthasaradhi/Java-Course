import java.util.Random;
class Randomnum{
    public static void main(String[] args){
        Random num = new Random();
        int x = num.nextInt(900000)+100000;
        System.out.println(x);
    }
}