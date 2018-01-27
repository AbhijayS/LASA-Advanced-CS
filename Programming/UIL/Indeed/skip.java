import java.lang.*;
import java.util.*;
import java.io.*;

class skip{
/*
  public static <T> void p(T arr)
  {
    System.out.println(arr);
  }
*/
  public static <T> void p(T arr)
  {
    System.out.print(arr);
  }

  public static void main(String[] args) throws FileNotFoundException{
    for (int i = 1; i <= 40; i++)
    {
      int num = 1;
      p(num+" ");
      for (int j = 0; j < 9; j++)
      {
        num+= i;
        p(num+" ");
      }
      p("\n");
    }
  }
}
