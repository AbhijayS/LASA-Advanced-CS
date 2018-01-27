/*
ID: abhijay3
LANG: JAVA
TASK: milk2
*/

import java.util.*;
import java.io.*;

class milk2
{
  public static void main(String[] args) throws Exception{
    Scanner scan = new Scanner (new File("milk2.in"));
    PrintWriter out = new PrintWriter(new FileWriter("milk2.out"));
    int ts = scan.nextInt();
    char[] fmr = new char[1000000];
    for (int i = 0; i < 1000000; i++){fmr[i] = '0';}
    //p(fmr);


    for (int i = 0; i < ts; i++)
    {
      long s = scan.nextInt();
      long f = scan.nextInt();

      for (long j = s; j < f; j++)
      {
        fmr[(int)j] = '*';
      }
    }
    int pos;
    int maxMilk = 0;
    int localMilk = 0;
    int maxIdle = 0;
    int localIdle = 0;
    if ((pos = find(0, '*', fmr)) != -1)
    {
      for (int i = pos; i < fmr.length; i++)
      {
        if(fmr[i] == '*')
        {
          localMilk++;
          if(localIdle > maxIdle)
          {
            maxIdle = localIdle;
          }
          localIdle = 0;
          if(find(i, '*', fmr) == -1)
          {
            break;
          }
        }else{
          localIdle++;
          if (localMilk > maxMilk)
          {
            maxMilk = localMilk;
          }
          localMilk = 0;
        }
      }
    }

    p(maxMilk + " " + maxIdle);
    out.println(maxMilk+" "+maxIdle);
    out.close();
  }

  public static int find(int start, char c, char[] arr)
  {
    for (int i = start; i < arr.length-1; i++)
    {
      if(arr[i] == c){return i;}
    }
    return -1;
  }


  public static <T> void p(T arr)
  {
    System.out.println(arr);
  }

  public static void p(int[] arr)
  {
    String str = Arrays.toString(arr).replaceAll(",|\\[|\\]", "").trim();
    p(str);
  }

  public static void p(char[] arr)
  {
    String str = Arrays.toString(arr).replaceAll(",|\\[|\\]", "").trim();
    p(str);
  }

  public static void p(int[][] arr)
  {
    for (int[] a:arr)
    {
      p(a);
    }
  }
}
