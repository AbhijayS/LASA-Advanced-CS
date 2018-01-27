import java.util.*;
import java.io.*;

class Words
{
  public static void main(String[] args) throws FileNotFoundException{
    Scanner scan = new Scanner(new File("words.dat"));
    int lines = Integer.parseInt(scan.nextLine());
    for (int i = 0; i < lines; i++)
    {
      p(scan.next()+" ");
      String rest = scan.nextLine();
      Scanner S = new Scanner(rest);
      while(S.hasNext())
      {
        String name = S.next();
        //p(name);
        p(name.charAt(0)+" ");
      }
      p("\n");
    }

  }
  public static <T> void p(T arr)
  {
    System.out.print(arr);
  }

}
