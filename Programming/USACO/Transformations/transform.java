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
    Scanner scan = new Scanner (new File("transform.in"));
    //PrintWriter out = new PrintWriter(new FileWriter("transform.out"));
    int w = scan.nextInt();
    char[][] game = new char[w][w];
    char[][] result = new char[w][w];

    if(game == result)
    {
      //#6
    }else if(turn90(1, game) == result)
    {
      //#1
    }else if(turn90(2, game) == result)
    {
      //#2
    }else if(turn90(3, game) == result)
    {
      //#3
    }else if(reflect(game) == result)
    {
      //#4
    }else{
      if (turn90(1, reflect(game)) == result) || (turn90(2, reflect(game)) == result) || (turn90(3, reflect(game)) == result)
      {
        //#5
      }else{
        //#7
      }
    }
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
