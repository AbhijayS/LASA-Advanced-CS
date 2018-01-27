import java.lang.*;
import java.util.*;
import java.io.*;

class yes{

  public static <T> void p(T arr)
  {
    System.out.print(arr);
  }

  public static void main(String[] args) throws FileNotFoundException
  {
    Scanner scan = new Scanner(new File("yes.dat"));
    int sets = scan.nextInt();
    for (int i = 0; i < sets; i++)
    {
      int people = scan.nextInt();
      int y = 0;
      int n = 0;
      boolean end = false;
      for (int j = 0; j < people; j++)
      {
        if (end == true)
        {
          break;
        }
        String g = scan.next();
        String vote = scan.next();
        if (g.equals("caesar"))
        {
          if (vote.equals("Y"))
          {
            p("YES\n");
          }else{
            p("No\n");
          }
          end = true;
        }else if(vote.equals("Y"))
        {
          y++;
        }else{
          n++;
        }

      }
      if (end != true)
      {
        if (y>n)
        {
          p("YES\n");
        }else if (n > y)
        {
          p("No\n");
        }else {
          p("Tie\n");
        }
        y = 0;
        n = 0;
      }
    }

  }
}
