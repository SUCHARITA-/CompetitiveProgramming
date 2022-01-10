import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
        int temp = 0;
        for(int i=0; i<4; i++){
            arr[i] = sc.nextInt();
        }
        String str = sc.next();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='1'){
                temp+=arr[0];
            }else if(str.charAt(i)=='2'){
                temp+=arr[1];
            }else if(str.charAt(i)=='3'){
                temp+=arr[2];
            }else if(str.charAt(i)=='4'){
                temp+=arr[3];
            }
        }
        System.out.println(temp);*/

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
        int temp = 0;
        for(int i=0; i<4; i++){
            arr[i] = sc.nextInt();
        }
        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            temp += arr[((int)(str.charAt(i))) - '0'-1];


        }
        System.out.println(temp);

    }
}
