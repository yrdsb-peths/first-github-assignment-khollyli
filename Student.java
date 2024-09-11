import java.util.*;

/**
 * @author Kholly Li
 */

public class Student
{
  public static void main()
  {
    Scanner scan = new Scanner (System.in);
    System.out.println("Enter your first name: ");
    String firstName = scan.nextLine();
    System.out.println("Enter your last name: ");
    String lastName = scan.nextLine();

    System.out.println("Hello " + firstName + " " + lastName + "!");
  }

  public int num()
  {
    int x = 10;
    int y = 7;
    int sum = x + y;
    int product = x * y;
  }
}
