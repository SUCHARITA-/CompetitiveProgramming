import java.util.*;
public class Main {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int x;
       for(int i=1; i<=5; i++)
           for (int j = 1; j <= 5; j++) {
               x = sc.nextInt();
               if (x == 1) {
                   System.out.print(Math.abs(i - 3) + Math.abs(j - 3));
                   break;
               }
           }

    }
}
