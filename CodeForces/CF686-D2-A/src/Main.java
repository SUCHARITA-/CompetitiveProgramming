import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        long total = x;
        int temp = 0;
        while(n-- >0){
            String sign = sc.next();
            int val = sc.nextInt();

            if(sign.equals("+")){
                total=total+val;

            } else if ( sign.equals("-") && (val<= total) ){
                total=total-val;

            }else{
                temp++;
            }
        }
        System.out.println(total+" "+temp);
    }
}
