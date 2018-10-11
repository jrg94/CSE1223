import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.util.stream.*;

/**
 * Tests project 5 as specified by:
 * http://web.cse.ohio-state.edu/cse1223/currentsem/projects/CSE1223Project05.html
 *
 * This test file verifies that the Project 5 solution passes on the basis of
 * content rather than structure. In other words, we don't care if the output
 * doesn't structurally look exactly like the expected output. However, we do
 * care that the solution has all the expected content.
 */
public class Project07Test {
  
  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
  private static final int PROJECT_NUMBER = 7;
  
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
   * Takes a set of inputs and joins them with newlines.
   *
   * @param inputs an variable length collection of strings
   * @return the input collection as a string separated by newlines
   */
  private String buildLines(String ... inputs) {
    StringBuilder sb = new StringBuilder();
    for (String input: inputs) {
      sb.append(input);
      sb.append(System.lineSeparator());
    }
    return sb.toString();
  }
  
  /**
   * A recursive method which returns the main method from the proper class.
   *
   * @param toTest an ArrayList of strings to test
   * @return the class object
   */
  private static Class<?> getClass(ArrayList<String> toTest) {
    Class<?> cls;
    try {
      cls = Class.forName(toTest.get(0));
    } catch (ClassNotFoundException e) {
      System.err.println("Failed to find the class: " + toTest.get(0));
      toTest.remove(0);
      if (!toTest.isEmpty()) {
        cls = getClass(toTest);
      } else {
        cls = null;
        System.exit(1);
      }
    }
    return cls;
  }
  
  /**
   * A generic method for running static methods using reflection.
   */
  public static void runStaticMethod(Class<?> cls, String methodName, Class<?>[] parameters, Object[] args) {
    try {
      Method meth = cls.getMethod(methodName, parameters);
      String[] params = null;
      meth.invoke(null, args);
    } catch (NoSuchMethodException e) {
      System.err.println("No method main");
      System.exit(1);
    } catch (IllegalAccessException e) {
      System.err.println("Can't invoke method main");
      System.exit(1);
    } catch (InvocationTargetException e) {
      System.err.println("Can't target method main");
      System.exit(1);
    }
  }
  
  /**
   * Runs the main method of the test class.
   *
   * @param toTest an array of strings to test
   */
  private static void runMain(ArrayList<String> toTest) {
    Class<?> cls = getClass(toTest);
    Class<?>[] parameters = {String[].class};
    Object[] args = null;
    runStaticMethod(cls, "main", parameters, args);
  }
  
  /**
   * Generates a list of test classes.
   * Add test cases to this list as you find them.
   *
   * @param project the current project number
   * @return an ArrayList of strings to test
   */
  private ArrayList<String> getTestClasses(int project) {
    ArrayList<String> toTest = new ArrayList<String>();
    toTest.add("osu.cse1223.Project%1$s");
    toTest.add("osu.cse1223.Project%1$sa");
    toTest.add("osu.cse1223.CSEProject%1$s");
    toTest.add("cse1223.Project%1$sa");
    toTest.add("cse1223.Project%1$s");
    toTest.add("project%1$s.Project%1$s");
    toTest.add("Project%1$s");
    toTest.add("osu.cse1223.DragonsGame");
    toTest.add("Project04.DragonTrainers");
    String projectNumberWhole = Integer.toString(project);
    String projectNumberPad = "0" + projectNumberWhole;
    int originalSize = toTest.size();
    for (int i = 0; i < originalSize; i++) {
      String test = toTest.get(i);
      toTest.set(i, String.format(test, projectNumberPad));
      toTest.add(String.format(test, projectNumberWhole));
      toTest.add(String.format(test, projectNumberPad).toLowerCase());
      toTest.add(String.format(test, projectNumberWhole).toLowerCase());
    }
    return toTest;
  }
  
  /**
   * Removes all newlines and spaces, so strings can be
   * compared on a content basis.
   *
   * @param input an input string
   * @return an input string stripped of all spaces and newlines
   */
  private String reduceString(String input) {
    return input.replace("\n", "").replaceAll("\\s+", "").toLowerCase();
  }
  
  /////////////////// Implementation //////////////////////////////////
  
  /**
   * Generates the expected output for testing.
   */
  private String buildSolution(String... creditCardNumbers) {
    ArrayList<String> solutionList = new ArrayList<String>();
    return String.join("\n", solutionList);
  }
  
  /**
   * A helper method which allows us to rapidly build test cases.
   */
  private void runCase() {
    String input = buildLines();
    InputStream inContent = new ByteArrayInputStream(input.getBytes());
    System.setIn(inContent);
    
    // Run student solution
    runMain(getTestClasses(PROJECT_NUMBER));
    
    // Test expected output to output
    String output = outContent.toString();
    String expectedOutput = buildSolution();
    assertEquals(reduceString(expectedOutput), reduceString(output));
  }
  
  private void runGetRoll() {
    Class<?> cls = getClass(getTestClasses(PROJECT_NUMBER));
    Class<?>[] parameters = null;
    Object[] args = null;
    runStaticMethod(cls, "getRoll", parameters, args);
  }
}
