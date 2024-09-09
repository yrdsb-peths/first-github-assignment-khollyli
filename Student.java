import java.util.*;

/**
 * hello
 * @author Kholly Li
 */

public class Student
{
  public static void main()
  {
    // Asks for user input
    Scanner scan = new Scanner (System.in);
    System.out.println("Enter your first name: ");
    String firstName = scan.nextLine();
    System.out.println("Enter your last name: ");
    String lastName = scan.nextLine();

    System.out.println("Hello " + firstName + " " + lastName + "!");
  }
}
