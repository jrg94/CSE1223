import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import java.io.*;
import java.lang.reflect.*;

public class Project02Test {
  
  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
  
  /**
   * Sets input and output streams to local print streams for analysis.
   */
  @Before
  public void setUp() {
    System.setOut(new PrintStream(outContent));
    System.setErr(new PrintStream(errContent));
  }
  
  /**
   * Sets input and output streams back to normal.
   */
  @After
  public void tearDown() {
    System.setIn(System.in);
    System.setOut(System.out);
  }
  
  /**
   * Generates the solution for testing.
   */
  public String buildSolution(String fullString, String substring, int position, String replacement) {
    int substringStart = fullString.indexOf(substring);
    String[] solutionList = {
      "Enter a long string: ",
      "Enter a substring: ",
      "Length of your string: " + fullString.length(),
      "Length of your substring: " + substring.length(),
      "Starting position of your substring in string: " + substringStart
    };
    String solution = buildLines(solutionList);
    return solution;
  }
  
  /**
   * Constructs user input for testing.
   */
  public String constructInput(String fullString, String substring, int position, String replacement) {
    return buildLines(fullString, substring, Integer.toString(position), replacement);
  }
  
  /**
   * Takes a set of inputs and joins them with newlines.
   */
  public String buildLines(String ... inputs) {
    StringBuilder sb = new StringBuilder();
    for (String input: inputs) {
      sb.append(input);
      sb.append(System.lineSeparator());
    }
    return sb.toString();
  }
}
