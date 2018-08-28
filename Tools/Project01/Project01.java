import java.util.Scanner;

public class Project01 {
  
  public static int getNumberFromCommandLine(String request) {
    System.out.println(request);
    Scanner keyboard = new Scanner(System.in);
    int num = Integer.parseInt(keyboard.nextLine());
    return num;
  }
  
  public static void outputArithmetic(int firstVal, int secondVal, char operator) {
    int result = 0;
    
    switch (operator) {
      case '+':
        result = firstVal + secondVal;
        break;
      case '-':
        result = firstVal - secondVal;
        break;
      case '*':
        result = firstVal * secondVal;
        break;
      case '/':
        result = firstVal / secondVal;
        break;
      case '%':
        result = firstVal / secondVal;
        break;
      default: throw new ArithmeticException();
    }
    
    System.out.println(firstVal + " " + operator + " " + secondVal + " = " + result);
  }
  
  public static void main(String[] args) {
    int firstNumber = getNumberFromCommandLine("Enter the first number: ");
    int secondNumber = getNumberFromCommandLine("Enter the first number: ");
    outputArithmetic(firstNumber, secondNumber, '+');
  }
  
}
