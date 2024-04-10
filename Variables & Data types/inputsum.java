import java.util.Scanner;

public class inputsum {  // Class name should start with a capital letter
  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);

    System.out.println("Enter the value of a:");  // Prompt for input
    int a = num.nextInt();

    System.out.println("Enter the value of b:");  // Prompt for input
    int b = num.nextInt();

    int sum = a + b;

    System.out.println("a = " + a + ", b = " + b + ", a + b = " + sum);  // Concatenate strings for proper output
  }
}

