import java.util.*;
import java.io.*;

class test
{
  public static void main(String[] args) throws FileNotFoundException{
    Scanner scan = new Scanner(new File("fastmile.dat"));
    int lines = Integer.parseInt(scan.nextLine());

    for (int i = 0; i < lines; i++)
    {
      String name = scan.next();
      p(name);
      String line = scan.nextLine();
      Scanner S = new Scanner(line);
      int mm = Integer.MAX_VALUE;
      int ms = Integer.MAX_VALUE;
      int mh = Integer.MAX_VALUE;
      int m = 0;
      int s = 0;
      int h = 0;
      while(S.hasNext())
      {

        String in = S.next();
        String []t = in.split("[.:]");
        m = Integer.parseInt(t[0]);
        s = Integer.parseInt(t[1]);
        h = Integer.parseInt(t[2]);
        if(m < mm)
        {
          mm = m;
          ms = s;
          mh = h;
        }else if(m == mm)
        {
          if(s < ms)
          {
            ms = s;
            mh = h;
          }else if(s == ms)
          {
            if(h < mh)
            {
              mh = h;
            }
          }
        }
      }

      p(" " + mm+":");
      p(ms+".");
      p(mh+"\n");

      /*
      String [] t = S.nextLine().split("[.:]");
      for (int j = 0; j < t.length; j++)
      {
        int m = Integer.parseInt(t[0]);
        int s = Integer.parseInt(t[1]);
        int h = Integer.parseInt(t[2]);
      }
*/
    }

  }
  public static <T> void p(T arr)
  {
    System.out.print(arr);
  }

}
