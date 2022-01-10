

import java.util.*;
// -x = ~x + 1;
// -~x = x + 1;
public class AddOneToInteger {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(-~num);
    }
}
