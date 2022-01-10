import java.util.*;

public class Main {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int r = sc.nextInt();
        int temp = 1;
        while((k*temp) %10 != r && ((k*temp) %10 != 0)){
            temp ++;
        }
        System.out.println(temp);
    }
}
