import java.util.*;
public class Main {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int tc = sc.nextInt();
       String value = sc.next();
       int len = value.length()-1;
       int start = 0;
       int count = 0;

       while(start < len){
           if(value.charAt(start) == value.charAt(start+1)){
               count++;
           }
           start++;
       }
       System.out.print(count);
    }
}
