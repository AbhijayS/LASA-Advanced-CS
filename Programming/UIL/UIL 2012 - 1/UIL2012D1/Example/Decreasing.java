import java.util.*;
import java.io.*;

class Decreasing
{
  public static void main(String[] args) throws FileNotFoundException{
    Scanner scan = new Scanner(new File("decreasing.dat"));
    int lines = Integer.parseInt(scan.nextLine());
    for (int i = 0; i < lines; i++)
    {
      int x = Integer.parseInt(scan.nextLine());
      int multiple = 2;
      int num = x*multiple;
      while(!digits(num))
      {
        multiple+=1;
        num = x*multiple;
      }
      p(num);
      p("\n");
    }
  }
  public static boolean digits(int num)
  {
    String n = Integer.toString(num);
    int ln = -1;
    for (int i = 0; i < n.length(); i++) {
      if(ln != -1)
      {
        int digit = Integer.parseInt(Character.toString(n.charAt(i)));
        if(digit < ln)
        {
          ln = digit;
        }else {
          return false;
        }
      }else{
        ln = Integer.parseInt(Character.toString(n.charAt(i)));
      }
    }
    return true;
  }

  public static <T> void p(T arr)
  {
    System.out.print(arr);
  }
}
