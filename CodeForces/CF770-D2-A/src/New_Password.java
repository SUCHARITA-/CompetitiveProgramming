import java.util.*;

public class New_Password {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int min = 97;
        int max = 122;
        String s = "";

        Set <Character> newSet = new HashSet();
        Random rand = new Random();
        while(newSet.size()!= k){
            int temp = rand.nextInt(max-min +1)+min;
            newSet.add((char)temp);
        }
        for(Character ch : newSet){
            s+=ch;
        }
        for(int i=0;i<s.length(); i++){
            if(s.length()!= n){
                s+=s.charAt(i);
            }else break;
        }
        System.out.println(s);
    }
}
