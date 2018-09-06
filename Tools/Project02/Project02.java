import java.util.*;

public class Project02 {
  
  public static void main(String[] args) { 
//    Enter a long string: The quick brown fox jumped over the lazy dog
//    Enter a substring: jumped
//    Length of your string: 44
//    Length of your substring: 6
//    Starting position of your substring in string: 20
//    String before your substring: The quick brown fox
//    String after your substring:  over the lazy dog
//    Enter a position between 0 and 43: 18
//    The character at position 18 is x
//    Enter a replacement string: leaped
//    Your new string is: The quick brown fox leaped over the lazy dog
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a long string: ");
    String fullString = in.nextLine();
    System.out.println("Enter a substring: ");
    String substring = in.nextLine();
    System.out.println("Length of your string: " + fullString.length());
    System.out.println("Length of your substring: " + substring.length());
    int substringStart = fullString.indexOf(substring);
    System.out.println("Starting position of your substring in string: " + substringStart);
    System.out.println("String before your substring: " + fullString.substring(0, substringStart));
  }
   
}
