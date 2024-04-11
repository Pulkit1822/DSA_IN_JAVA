import java.util.*;
public class for_loop {
  public static void main(String[] args) {
    int i;      //initialized i ouutside the loop because we are also using it outside

  for(i=0 ; i<=5 ; i++ ) {   //( initialisation ; condition ; updation )
    System.out.println("i = "+i);
  }
  System.out.println("i after the loop = "+i );
  
  }
}
