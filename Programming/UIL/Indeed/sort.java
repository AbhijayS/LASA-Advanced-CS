import java.lang.*;
import java.util.*;
import java.io.*;

class sort{

  public static <T> void p(T arr)
  {
    System.out.print(arr);
  }

  public static void main(String[] args) throws FileNotFoundException
  {
    Scanner scan = new Scanner(new File("sort.dat"));
    int sets = scan.nextInt();
    String[] order = {"p", "b", "h", "r", "q", "k", "P", "B", "H", "R", "Q", "K"};
    p(findPos(order, "P"));
    for (int i = 0; i < sets; i++)
    {
      String ns = scan.nextLine();
      Scanner ls = new Scanner(ns);
      int length = (ns.length()+1)/2;
      p(length+"\n");

      String[] A = new String[length];
      for (int ie = 0; ie < length; ie++)
      {
        A[ie] = ls.next();
      }
      String[] fn = new String[length];
      fn[0] = A[0];
      for (int ie = 1; ie < length; ie++)
      {
        int j = ie;
        while ((j >= 1) && (findPos(order, A[j-1]) > findPos(order, A[j])))
        {
          String hand = A[j];
          A[j] = A[j-1];
          A[j-1] = hand;
          j--;
        }
      }
      for (int ie = 0; ie < length; ie++)
      {
        p(fn[ie]+" ");
      }
      p("\n");

    }
  }
  public static int findPos(String[]arr, String find)
  {
    for (int i = 0; i < arr.length; i++)
    {
      if (find == arr[i])
      {
        return i;
      }
    }
    return 0;
  }
}
