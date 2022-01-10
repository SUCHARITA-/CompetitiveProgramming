import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Set newSet = new HashSet();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){

                newSet.add(str.charAt(i));
            }
        }
        System.out.println(newSet.size());
    }
}
