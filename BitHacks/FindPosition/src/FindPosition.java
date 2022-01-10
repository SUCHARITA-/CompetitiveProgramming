import java.util.*;
//Find the position of the rightmost set bit
public class FindPosition {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num & (num-1);
        System.out.println("Before--->"+ Integer.toBinaryString(num));
        num = num ^ temp;
        System.out.println("Before again--->"+ Integer.toBinaryString(num));
        int pos = 0;
        while (num != 0)
        {

            num = num >> 1;
            pos++;
        }

        System.out.println(pos);
    }
}
