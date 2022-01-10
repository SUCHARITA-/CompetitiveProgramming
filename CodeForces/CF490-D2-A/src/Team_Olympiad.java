import java.util.*;

public class Team_Olympiad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int gifted, nteam;
        int arr[][] = new int[4][5001];
        int count[] = new int[4];
        for(int id=1; id<=n; id++) {
            gifted = sc.nextInt();
            count[gifted]++;
            arr[gifted][count[gifted]] = id;
        }
            nteam = Math.min(Math.min(count[1],count[2]),count[3]);
            System.out.println(nteam);
            for(int i=1; i<=nteam; i++){
                System.out.println(arr[1][i]+" "+arr[2][i]+" "+arr[3][i]);
            }

    }
}
