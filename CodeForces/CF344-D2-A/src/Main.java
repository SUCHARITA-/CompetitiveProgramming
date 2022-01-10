import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = "";
        int count = 0;
        int tc = sc.nextInt();

        for(int i=0; i<tc; i++){
            String str = sc.next();
            if(!temp.equals(str)){
                temp = str;
                count++;
            }
        }
        //System.out.println("temp--->"+temp);
        System.out.println(count);
    }
}
