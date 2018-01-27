import java.lang.*;
import java.util.*;
import java.io.*;

class test{

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

  /*
  public static <T> void p(T[][] arr, T div)
  {
    for (int i = 0; i < T.length; i++)
    {
      for (int j = 0; j < T[i]; j++)
      {
        p(T[i][j]+div);
      }
      p("\n");
    }
  }
  */
  public static void main(String[] args) {
    int a[] = {1, 2, 3, 4};
    int[][] b = new int[2][3];
    p(a);
    p("\n");
    p(b);
  }

}
