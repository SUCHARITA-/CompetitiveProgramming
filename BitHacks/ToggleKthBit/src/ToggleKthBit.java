import java.util.*;
//Toggel the k'th bit
public class ToggleKthBit {

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        int temp = (num ^ (1<<(k-1)));
        System.out.println("Before--->"+Integer.toBinaryString(num));
        System.out.println("After---->"+Integer.toBinaryString(temp));

    }
}
