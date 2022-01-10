import java.util.*;
//Check if a positive integer is a power of 2 without using any branching or loop.
public class PowerOfTwo {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if((n & (n-1)) == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
