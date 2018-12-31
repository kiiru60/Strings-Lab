
/**
 * Tests our class String 
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OurStringTester
{
   
    public static void main (String[]args){
      char[] testData = new char[6];
      testData[0]='T';
      testData[1]='w';
      testData[2]='e';
      testData[3]='e';
      testData[4]='d';
      testData[5]='y';
      
      System.out.println("Test for constructors ");
      //test for OurString constructors 
      OurString testStr = new OurString(testData);
      OurString testStr2 = new OurString("Testing");
      OurString testStr3 = new OurString();
      OurString testStr4 = new OurString();
      System.out.println("Expected Tweedy");
      System.out.println(testStr.toString());
      System.out.println("Expected Testing");
      System.out.println(testStr2.toString());
      System.out.println("Expected Blank");
      System.out.println(testStr3.toString());
      
      System.out.println("Test for length Method");
      //Test for Length method
      System.out.println("Expected 6");
      System.out.println(testStr.toString().length());
      System.out.println("Expected 0");
      System.out.println(testStr4.toString().length());
      
      System.out.println("Test for CharAt");
      //test for charAt(int index)
      System.out.println("Expected e");
      System.out.println(testStr.toString().charAt(3));
      System.out.println("Expected d");
      System.out.println(testStr.toString().charAt(4));
      System.out.println("Expected index out of bounds");
      //System.out.println(testStr3.toString().charAt(0));
      //System.out.println(testStr4.toString().charAt(5));
      
      System.out.println("Test for Equals Method");
      //Test for OurString equals method
      System.out.println("Expected True");
      System.out.println(testStr.toString().equals("Tweedy"));
      System.out.println("Expected False");
      System.out.println(testStr.toString().equals("Tweddy"));
      
      //empty string and a string with contents
      System.out.println("Expected False");
      System.out.println(testStr.toString().equals(testStr3));
      //empty string and a string and an empty string
      System.out.println("Expected True");
      System.out.println(testStr3.toString().equals(testStr4));
      
      System.out.println("Test for startswith");
      //Test for OurString startswith method
      System.out.println("Expected True");
      System.out.println(testStr.toString().startsWith("Twe"));
      System.out.println("Expected false");
      System.out.println(testStr.toString().startsWith("TTe"));
      System.out.println("Expected false");
      System.out.println(testStr.toString().startsWith("t"));
      System.out.println("Expected True");
      System.out.println(testStr.toString().startsWith("Tw"));
      System.out.println("Expected True");
      System.out.println(testStr.toString().startsWith("T"));
      
      System.out.println("Test for index of");
      //Test for IndexOf method
      System.out.println("Expected 2");
      System.out.println(testStr.toString().indexOf('e'));
      System.out.println("Expected 5");
      System.out.println(testStr.toString().indexOf('y'));
      
      
      //Test for IndexOf method with a starting index
      System.out.println("Expected 3");
      System.out.println(testStr.toString().indexOf('e',3));
      System.out.println("Expected 5");
      System.out.println(testStr.toString().indexOf('y',3));
      
      System.out.println("Test for uppecase");
      // Test for toUpperCase
      System.out.println("Expected TWEEDY");
      System.out.println(testStr.toUpperCase());
      //Test for toLowerCase
      System.out.println("Expected tweedy");
      System.out.println(testStr.toLowerCase());
      
      System.out.println("Test for substring");
      //Test for Ourstring subString
      System.out.println("Expected eedy");
      System.out.println(testStr.substring(2));
      System.out.println("Expected dy");
      System.out.println(testStr.substring(4));
      
      System.out.println("Test for endswith");
      //Test for OursString Endswith
      System.out.println("Expected True");
      System.out.println(testStr.toString().endsWith("dy"));
      System.out.println("Expected false");
      System.out.println(testStr.toString().endsWith("fy"));
      System.out.println("Expected True");
      System.out.println(testStr.toString().endsWith("y"));
      
      System.out.println("Test for LastIndexOf");
      //Test for lastIndexof 
      System.out.println("Expected 3");
      System.out.println(testStr.toString().lastIndexOf('e'));
      System.out.println("Expected 5");
      System.out.println(testStr.toString().lastIndexOf('y'));
      //test for lastIndexOf with a startIndex
      System.out.println("Expected 3");
      System.out.println(testStr.toString().lastIndexOf('e',3));
      System.out.println("Expected -1");
      System.out.println(testStr.toString().lastIndexOf('y',3));
      
      
     }
  }
