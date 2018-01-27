import java.lang.*;
import java.util.*;
import java.io.*;

class magic{

  public static <T> void p(T arr)
  {
    System.out.print(arr);
  }

  public static void main(String[] args) throws NoSuchElementException, FileNotFoundException
  {
    int count = 0;
    Scanner scan = new Scanner(new File("magic.dat"));
    while(true)
    {
      String str = scan.nextLine();

      if (str.equals("0 0 0 0 0"))
      {
        break;
      }
      Scanner strscan = new Scanner(str);
      int A[] = new int[5];
      for (int i = 0; i < 5; i++)
      {
        A[i] = strscan.nextInt();
      }
      int a = A[0];
      int b = A[1];
      int c = A[2];
      int d = A[3];
      int l = A[4];
      for (int i = 0; i <= l; i++)
      {
        if ((func(a, b, c, i)%d) == 0)
        {
          count++;
        }
      }
      p(count+"\n");
      count = 0;

      /*int a = scan.nextInt();
      int b = scan.nextInt();
      int c = scan.nextInt();
      int d = scan.nextInt();
      int l = scan.nextInt();
      for (int i = 0; i < l; i++)
      {
        if ((func(a, b, c, i)%d) == 0)
        {
          count++;
        }
      }
      p(count+"\n");
      count = 0;
      */

    }

  }
  public static int func(int a, int b, int c, int i)
  {
    int var = ((i*i)*a) + (b*i) + c;
    return var;
  }
}
