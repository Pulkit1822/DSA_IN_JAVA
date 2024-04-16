import java.util.*;
public class While_loop3{
    public static void main(String srgs[]){
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int counter = 1;
        
        while(counter<= range){     //here counter sets to 1 and incresing every while loop until its equal to range.
            System.out.print(counter + " ");
            counter++;
        }
    }
}
//while loop executed
