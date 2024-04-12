import java.util.*;
public class reversedigit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();    //take input
        
        while( num > 0) {      //when reminder is 0, means digit all no. finished.
            int lastdigit = num%10;    //taking lastdigit from the digit.
            System.out.print(lastdigit + "");  //printing lastdigit at first palce.
            num = num/10;  //num/=10       //removing the last digit.
        }
        
        //while loop going to execute until digit value will be 0.
        
    }


}
    

