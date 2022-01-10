import java.util.*;

public class Main {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
            String str = sc.next();
            int len = str.length();
            //System.out.println("len-->"+len);
            if(len > 10){
                System.out.println(str.charAt(0)+""+(len-2)+""+str.charAt(str.length()-1));
            }else{
                System.out.println(str);
            }
        }
    }
}
