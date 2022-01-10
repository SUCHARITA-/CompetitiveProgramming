import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;
        Set<Character> uniqueChar = new HashSet<Character>();
        for(int i=0; i<str.length(); i++){
            uniqueChar.add(str.charAt(i));
        }
        //System.out.println(uniqueChar.size());
        count = uniqueChar.size();

        if(count % 2 == 0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
    }
}
