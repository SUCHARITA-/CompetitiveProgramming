import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int limak = sc.nextInt();
        int bob = sc.nextInt();
        int temp =0;
        while(limak <= bob){
            limak = limak * 3;
            bob = bob * 2;
            temp++;
        }
        System.out.println(temp);
    }
}
