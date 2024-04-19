import java.util.*;
public class sumEvenorOdd {
  public static void main(String[] args) {
    Scanner sc = new  Scanner(System.in);

    int number;
    int choice;
    int evenNumber = 0;
    int oddNumber = 0;

    do{
      System.out.println("Enter your number: ");
      number = sc.nextInt();

      if (number % 2 == 0){
        evenNumber += number;
      }
      else{
        oddNumber += number;
      }

      System.out.println("Do you want to continue, if yes then press '1' else press '0' for no." );
      choice = sc.nextInt();
    }while(choice==1);

    System.out.println("Sum of all even no. : " + evenNumber);
    System.out.println("Sum of all odd no. : " + oddNumber);
       
  }
}
