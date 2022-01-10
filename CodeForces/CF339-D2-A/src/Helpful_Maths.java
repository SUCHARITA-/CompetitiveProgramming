import java.util.*;

public class Helpful_Maths {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String temp ="";

        List<Integer> intList = new ArrayList<>();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != '+'){
                intList.add(Character.getNumericValue(str.charAt(i)));
            }
        }

        Collections.sort(intList);

        for(int i=0; i<intList.size(); i++){
            temp+=intList.get(i);
            if(i!= intList.size() -1){
                temp+="+";
            }
        }
        System.out.println(temp);
    }
}
