import java.util.*;
public class Main {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int upper = 0, lower = 0;
        String str = sc.next();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) >='A' &&  str.charAt(i)<= 'Z') upper++;
            if(str.charAt(i) >='a' &&  str.charAt(i)<= 'z') lower++;
        }

        if(upper>lower) System.out.println(str.toUpperCase());
        if(lower>=upper) System.out.println(str.toLowerCase());

    }
}
