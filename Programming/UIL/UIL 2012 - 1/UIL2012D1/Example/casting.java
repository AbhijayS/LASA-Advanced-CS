import java.util.*;
import java.io.*;

class casting
{
  public static void main(String[] args) {
    Scanner scan = new Scanner(new File("casting.dat"));
    int sets = scan.nextInt();
    List<Integer> arr = new ArrayList<Integer>;
    for (int i = 0; i < sets; i++)
    {
      String num = scan.next();
      for(int a = 0 ; a < num.length; a++)
      {
        arr.put((int)num.charAt(a));
      }
      while(number >= 9)
      {
        for(int a = 0; a < arr.size(); a++)
        {
          int number = 1000;
          number += a;
        }
        arr.clear();
        for (int a = 0; a < num.length; a++)
        {
          arr.put(a);
        }
      }
    }
  }
  public static <T> void p(T arr)
  {
    System.out.print(arr);
  }
  public static void p(int[] arr)
  {
    String str = Arrays.toString(arr).replaceAll(",|\\[|\\]", "").trim();
    p(str);
  }

  public static void p(int[][] arr)
  {
    for (int[] a:arr)
    {
      p(a);
      p("\n");
    }
  }



}
