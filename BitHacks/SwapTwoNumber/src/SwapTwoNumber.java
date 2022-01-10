import java.util.*;
//Swap two numbers without using third variable
//Solve this using XOR as X^X = 0
public class SwapTwoNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if((num1 ^ num2) !=0){ // then both are same and no need to swap
            num1 = num1 ^ num2;
            num2 = num1 ^ num2;
            num1 = num1 ^ num2;
        }
        System.out.println("firstNum-->"+num1+" "+"secondNum-->"+num2);
    }
}
