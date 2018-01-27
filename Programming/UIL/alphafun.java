import java.util.*;
import java.io.*;

class alphafun
{
  public static void main(String[] args) throws FileNotFoundException {
    Scanner scan = new Scanner(new File("alphafun.dat"));
    List<String> arr = new ArrayList<String>();
    String word;
    while(scan.hasNext())
    {
      word = scan.next();
      System.out.println(word);
      String newWord = Integer.toString(word.charAt(2)+word.charAt(4)+word.charAt((word.length())-1)+word.charAt(0));
      arr.add(newWord);
      word = "";
      newWord = "";
    }
    for (int i = 0; i < arr.size(); i++)
    {
      System.out.println(arr.get(i));
    }
  }
}
