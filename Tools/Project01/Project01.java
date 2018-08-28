import java.util.Scanner;

public class Project01 {
  
  public static int getNumberFromCommandLine(String request) {
    System.out.println(request);
    Scanner keyboard = new Scanner(System.in);
    int num = Integer.parseInt(keyboard.nextLine());
    return num;
  }
  
  public static void main(String[] args) {
    int firstNumber = getNumberFromCommandLine("Enter the first number: ");
    int secondNumber = getNumberFromCommandLine("Enter the first number: ");
  }
  
}
