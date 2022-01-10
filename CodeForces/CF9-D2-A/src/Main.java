import java.util.*;

public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt();
        int W = sc.nextInt();
        int max = Math.max(Y, W);
        int dot = (6 - max) + 1;
        int total = 6;
        int g;

        g = gcd(dot, total);
        int A = dot / g;
        int B = total /g;
        System.out.println(A+"/"+B);
    }
    static int gcd(int a, int b){
        if (a == 0)
            return b;
        return gcd(b%a, a);
    }
}
