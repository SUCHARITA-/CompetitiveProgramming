import java.util.*;

public class UnsetRightMostSetBit {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Before---->"+Integer.toBinaryString(num));
        System.out.println("After----->"+Integer.toBinaryString((num & (num-1))));
    }
}
