import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first1 = sc.next();
        String seco1 = sc.next();

        String first = first1.toUpperCase();
        String seco = seco1.toUpperCase();
        int flag = 0;
        for(int i=0; i<first.length(); i++){
             if(first.charAt(i) < seco.charAt(i)){
                flag = -1;
                break;
            }else if(first.charAt(i) > seco.charAt(i)){
                flag = 1;
                break;
            }

        }
        System.out.println(flag);

    }
}
