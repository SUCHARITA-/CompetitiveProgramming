import java.util.*;

//Turn on k'th bit in a number
public class BitTurnOn {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int k = sc.nextInt();

        int temp = (number | (1<<(k-1)));
        System.out.println("Before-->"+Integer.toBinaryString(number));
        System.out.println("After--->"+ Integer.toBinaryString(temp));
    }
}
