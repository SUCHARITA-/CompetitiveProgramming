import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char initalPointer = 'a';
        int rotation = 0;
        String actualStr = sc.next();
        //zeus
        for(int i=0; i<actualStr.length(); i++){
            int clock = Math.abs((int)actualStr.charAt(i) - (int)initalPointer);
            int antiClock = 26 - Math.abs((int)actualStr.charAt(i) - (int)initalPointer);
            rotation+= Math.min(clock, antiClock);
            initalPointer = actualStr.charAt(i);
        }
        System.out.println(rotation);
    }
}
