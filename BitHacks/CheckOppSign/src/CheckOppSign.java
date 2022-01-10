import java.util.*;

public class CheckOppSign {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int secNum = sc.nextInt();

        if((firstNum^secNum)==0){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}
