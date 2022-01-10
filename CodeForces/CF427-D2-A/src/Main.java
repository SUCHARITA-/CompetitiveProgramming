import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int tc = sc.nextInt();
       int sum = 0;
       int temp = 0;
       int arr[] = new int[tc];

       for(int i=0; i<tc; i++){
           int value = sc.nextInt();
           if(value > 0){
               sum+=value;
           }else{
               if(sum > 0){
                   sum+=value;
               }else{
                   temp++;
               }
           }
       }
        System.out.println(temp);
    }
}



