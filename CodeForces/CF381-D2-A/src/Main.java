import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sereja = 0;
        int dima = 0;
        int tc = sc.nextInt();
        int arr[] = new int[tc];

        int left = 0;
        int right = tc-1;
        int max = 0;
        int turn = 0;

        for(int i=0; i<tc; i++){
            arr[i] = sc.nextInt();
        }

        while(left <= right){
            if(arr[left] >= arr[right]){
                max = arr[left];
                left++;
            }else{
                max = arr[right];
                right--;
            }


            if(turn % 2 == 0){
                sereja+= max;
            }else{
                dima+= max;
            }

            turn++;
        }

        System.out.println(sereja+" "+dima);
    }
}
