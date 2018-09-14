import java.util.Scanner;
public class Project03 {
  
  private static class MathData {
    private int result;
    private String equation;
    public MathData(int result, String equation) {
      this.result = result;
      this.equation = equation;
    }
    public int getResult() {
      return this.result;
    }
    public String getEquation() {
      return this.equation;
    }
  }
  
  private static int getRandom(int range) {
    return (int) (Math.random() * range) + 1;
  }
  
  /**
   * Returns a MathData object.
   * 
   * @param firstVal some integer value
   * @param secondVal some integer value
   * @param operator some binary arithmetic operator (+, -, *, /, %)
   * @return a String in the form "firstVal operator secondVal = result"
   */
  private static MathData generateMathData(int firstVal, int secondVal, char operator) {
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
    
    String equation = firstVal + " " + operator + " " + secondVal + " = " + System.lineSeparator();
    
    return new MathData(result, equation);
  }
  
  private static MathData[] generateAllMathData(int range) {
    int first = getRandom(range);
    int second = getRandom(range);
    MathData addition = generateMathData(first, second, '+');
    MathData multiplication = generateMathData(first, second, '*');    
    MathData division = generateMathData(first, second, '/');    
    MathData remainder = generateMathData(first, second, '%');
    return new MathData[] {addition, multiplication, division, remainder};
  }
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name = in.nextLine();
    System.out.println("Welcome " + name + "! Please answer the following questions:");
    MathData[] data = generateAllMathData(20);
    int correct = 0;
    for (MathData eq : data) {
      System.out.println(eq.getEquation());
      int answer = Integer.parseInt(in.nextLine());
      if (answer == eq.getResult()) {
        System.out.println("Correct!");
        correct++;
      } else {
        System.out.println("Wrong!");
      }
    }
    System.out.println("You got " + correct + " correct answers");
    System.out.println("That's " + ((double) correct) / data.length * 100 + "%");
  }
}