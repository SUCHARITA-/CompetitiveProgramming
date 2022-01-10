import java.util.*;

public class Main {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ins = sc.next();
        int temp = 1;
        int pos = 0;
        for(int i=0; i<ins.length(); i++){
            if(ins.charAt(i) == str.charAt(pos)){
                pos++;
                temp++;
            }
        }
        System.out.print(temp);
    }
}
