import java.util.Scanner;

public class Project01 {
  
  public static int getNumberFromCommandLine(Scanner keyboard, String request) {
    System.out.println(request);
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
        result = firstVal % secondVal;
        break;
      default: throw new ArithmeticException();
    }
    
    System.out.println(firstVal + " " + operator + " " + secondVal + " = " + result);
  }
  
  public static void outputAverage(int firstVal, int secondVal) {
    int average = (firstVal + secondVal) / 2;
    System.out.println("The average of your two numbers is: " + average);
  }
  
  public static void generateOutput(int firstNumber, int secondNumber) {
    outputArithmetic(firstNumber, secondNumber, '+');
    outputArithmetic(firstNumber, secondNumber, '-');
    outputArithmetic(firstNumber, secondNumber, '*');    
    outputArithmetic(firstNumber, secondNumber, '/');    
    outputArithmetic(firstNumber, secondNumber, '%');
    outputAverage(firstNumber, secondNumber);
  }
  
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int firstNumber = getNumberFromCommandLine(keyboard, "Enter the first number: ");
    int secondNumber = getNumberFromCommandLine(keyboard, "Enter the second number: ");
    keyboard.close();
    generateOutput(firstNumber, secondNumber);
  }
  
}
