import java.util.*;
public class reverseDigit2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    //take input
        int rev = 0;
        
        while( n > 0) {      //when reminder is 0, means digit all no. finished.
            int lastdigit = n % 10;    //taking lastdigit from the digit.
            rev = (rev*10) + lastdigit;  //storing reversed digit. 
            n = n/10;  //num/=10       //removing the last digit.
        }
        System.out.print(rev);
        //while loop going to execute until digit value will be 0.
        
    }
    
}
