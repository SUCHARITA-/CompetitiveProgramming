import java.util.*;
//Turn off k'th bit in a number

public class BitTurnOff {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int k = sc.nextInt();
        //we'll make left shift till the asked bit and then complement , then make Bitwise AND operation
        int temp = number & (~(1 << (k-1)));
        System.out.println("Before-->"+Integer.toBinaryString(number));
        System.out.println("After--->"+ Integer.toBinaryString(temp));
    }
}
