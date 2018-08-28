// http://web.cse.ohio-state.edu/cse1223/currentsem/projects/CSE1223Project01.html
import junit.framework.TestCase;
import java.io.*;

public class Project01Test extends TestCase {
  
  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
  private final String testString = "Enter the first number: " + System.lineSeparator()
    + "Enter the second number: " + System.lineSeparator()
    + "12 + 3 = 15" + System.lineSeparator()
    + "12 - 3 = 9" + System.lineSeparator()
    + "12 * 3 = 36"  + System.lineSeparator()
    + "12 / 3 = 4"  + System.lineSeparator()
    + "12 % 3 = 0" + System.lineSeparator()
    + "The average of your two numbers is: 7" + System.lineSeparator();

  public static String outputArithmetic(int firstVal, int secondVal, char operator) {
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
    
    return firstVal + " " + operator + " " + secondVal + " = " + result + System.lineSeparator();
  }
  
  public static String outputAverage(int firstVal, int secondVal) {
    int average = (firstVal + secondVal) / 2;
    return "The average of your two numbers is: " + average + System.lineSeparator();
  }
  
  public static String generateOutput(int firstNumber, int secondNumber) {
    String output = "Enter the first number: " + System.lineSeparator();
    output += "Enter the second number: " + System.lineSeparator();
    char[] operators = {'+', '-', '*', '/', '%'};
    for(char operator : operators) {
      output += outputArithmetic(firstNumber, secondNumber, operator);
    }
    output += outputAverage(firstNumber, secondNumber);
    return output;
  }

  public void runCase(int firstVal, int secondVal) {
    System.setOut(new PrintStream(outContent));
    System.setErr(new PrintStream(errContent));
    
    String data = firstVal + System.lineSeparator() + secondVal + System.lineSeparator();
    InputStream inContent = new ByteArrayInputStream(data.getBytes());
    System.setIn(inContent);
    
    Project01.main(new String[0]);

    assertEquals(generateOutput(firstVal, secondVal), outContent.toString());
    
    System.setIn(System.in);
    System.setOut(System.out);
  }
  
  public void testMainCase1() {
    runCase(12, 3);
  }
  
  public void testMainCase2() {
    runCase(5, 7);
  }
  
}
