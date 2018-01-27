import java.lang.*;
import java.util.*;
import java.io.*;

class pushups{

  public static <T> void p(T arr)
  {
    System.out.print(arr);
  }

  public static void main(String[] args) throws FileNotFoundException
  {
    int n = 1;
    int next = 1;
    for (int i = 1; n < 40; i++)
    {
      if(i == next)
      {
        if (i%2 == 1)
        {
          if (i == 1)
          {
              p("On day "+i+" do "+n+" pushup everyday for "+ n +" day.\n");
          }
          next = i+n;
        }else {
          n+=1;
          next = i+n;

          p("On day "+i+" do "+n+" pushups everyday for "+ n +" days.\n");
        }
      }
    }
  }
}
