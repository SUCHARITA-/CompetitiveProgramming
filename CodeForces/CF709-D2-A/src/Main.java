import java.util.*;

public class Main {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int d = sc.nextInt();
        int count = 0;
        int holder = 0;
        int temp = 0;
        for(int i=0; i<n; i++) {
            holder = sc.nextInt();
            if (holder <= b) {

                count += holder;
                //System.out.println("count-->" + count);
            }
            if (count > d) {
                    temp++;
                    count = 0;
                }
            }

        System.out.println(temp);
    }
}
