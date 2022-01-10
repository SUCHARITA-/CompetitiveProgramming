import java.util.*;

public class Main {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Set newSet = new HashSet();
        for(int i=0; i<4; i++){
            newSet.add(sc.nextInt());
        }
        System.out.println(4 - newSet.size());
    }
}
