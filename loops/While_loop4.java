import java.util.*;
public class While_loop4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();   // j = range
        int i = 1;    // i = counter
        int sum = 0;   // sum --> where counter values are storing in every while loop.

        while(i<=j){
            sum = sum+i;
            i++;
        }
        System.out.print("sum is:" + sum);
    }
    
}
