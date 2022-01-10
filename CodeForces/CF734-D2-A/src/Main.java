import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int A=0,D=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='A'){
                A++;
            }else{
                D++;
            }
        }
        if(A==D){
            System.out.println("Friendship");
        }else if(A>D){
            System.out.println("Anton");
        }else{
            System.out.println("Danik");
        }
    }
}
