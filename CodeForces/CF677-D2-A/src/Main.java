import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int temp =0;
        for(int i=0; i<n; i++){
            int ai = sc.nextInt();
            if(ai<=h) {
                temp++;
            }else{
                temp = temp + 2;
            }
        }
        System.out.println(temp);
    }
}
