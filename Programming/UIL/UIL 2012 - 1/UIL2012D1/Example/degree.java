import java.util.*;
import java.io.*;

class degree
{
  public static void main(String[] args) throws FileNotFoundException{
    Scanner scan = new Scanner(new File("degree.dat"));
    int lines = Integer.parseInt(scan.nextLine());
    for (int i = 0; i < lines; i++)
    {
      String line = scan.nextLine();
      Scanner ls = new Scanner(line);
      int[] arr = new int[(line.length()+1)/2];

      for(int j = 0; j < arr.length; j++)
      {
        arr[j] = ls.nextInt();
      }
      System.out.println(degree(arr));
    }

  }

  public static int degree(int[] a)
  {
    int[] a2 = new int[a.length];
    for (int i = 0; i < a.length; i++)
    {
      int count = 0;
      for (int j = i; j < a.length; j++)
      {
        if(a[j] < a[i])
        {
          count++;
        }
      }
      a2[i] = count;
      count = 0;
    }
    int count = 0;
    for (int i : a2)
    {
      count+=i;
    }
    return count;
  }

  public static <T> void p(T arr)
  {
    //System.out.print(arr);
  }
  public static void p(int[] arr)
  {
    //String str = Arrays.toString(arr).replaceAll(",|\\[|\\]", "").trim();
    //p(str);
  }

  public static void p(int[][] arr)
  {
    //for (int[] a:arr)
    //{
    //  p(a);
    //  p("\n");
    //}
  }


}
