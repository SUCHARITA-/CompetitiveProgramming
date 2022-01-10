import java.util.*;
// Check if k'th bit is set for a number
public class CheckBit {
    public static int isKthBit(int num, int k){
        return (num & (1<<(k-1)));
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int k = sc.nextInt();
        if(isKthBit(number,k) !=0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
