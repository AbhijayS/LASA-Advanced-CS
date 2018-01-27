import java.lang.*;
import java.util.*;
import java.io.*;

class cost{
/*
  public static <T> void p(T arr)
  {
    System.out.println(arr);
  }
*/
  public static void main(String[] args) throws FileNotFoundException{
    Scanner scan = new Scanner(new File("cost.dat"));
    int sets = scan.nextInt();

    for (int i = 0; i < sets; i++)
    {
      int [] arr = new int[3];
      for (int j = 0; j < 3; j++)
      {
        arr[j] = scan.nextInt();
      }
      sort(arr);
      System.out.println("Case "+(i+1)+": "+arr[1]);
    }
  }

  public static void sort(int [] A)
  {
    for (int i = 1; i < A.length; i++)
    {
      int j = i;
      while ((j >= 1) && (A[j-1] > A[j]))
      {
        int hand = A[j];
        A[j] = A[j-1];
        A[j-1] = hand;
        j--;
      }
    }
  }
}
