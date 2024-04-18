import java.util.*;
public class factorial {
  public static void main(String[] args) {
    int num;
    int factNum = 1;  //intialized at 1( 0! = 1)

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number: ");
    num = sc.nextInt();

    for(int i=1; i<=num ; i++){    //here, i storing values of multilplys ( 1 to num) till equal to num. 
      factNum *= i;
    }
  
    System.out.println(factNum);   
  }
}