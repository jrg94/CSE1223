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


  public void testMain() {
    System.setOut(new PrintStream(outContent));
    System.setErr(new PrintStream(errContent));
    
    String data = "12\n3\n";
    InputStream inContent = new ByteArrayInputStream(data.getBytes());
    System.setIn(inContent);
    
    Project01.main(new String[0]);
    
    assertEquals(testString, outContent.toString());
    
    System.setIn(System.in);
    System.setOut(System.out);
  }
  
}
