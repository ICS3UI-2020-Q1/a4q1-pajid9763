import java.util.Scanner;
/**
 * program that counts down by 5
 * @author Darian
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  // ask the user for an integer
  System.out.println("Please enter an integer to count down to");
  int num = input.nextInt();
  int count = 100;
  
  // calculate count down
  System.out.println("Count Down:");
  while (count >= num){
    System.out.println(count);
    count = count - 5;
  }

  }
}
