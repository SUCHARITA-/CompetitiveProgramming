import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = 0;
        for(int i=0; i<n; i++){
            int p = sc.nextInt();
            int v = sc.nextInt();
            int t = sc.nextInt();


            int total = p +v +t;
            if(total >= 2) temp++;
        }
        System.out.println(temp);
    }
}
