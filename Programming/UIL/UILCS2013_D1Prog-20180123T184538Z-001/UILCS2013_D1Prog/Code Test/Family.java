import java.io.*;
import java.util.*;

class Person
{
  String name;
  int gen;
  Person(String str, int pos)
  {
    this.name = str;
    this.gen = pos;
  }
  void update(int i)
  {
    pos+=i;
  }
}

public class Family {

	public static void main(String args[]) throws Exception
	{
    Scanner scan = new Scanner(new File("family.dat"));
    Map<String, Integer> nouns = new HashMap<String, Integer>();
    nouns.put("MOTHER", -1);
    nouns.put("FATHER", -1);
    nouns.put("SIBLING", 0);
    ArrayList<Person> tree = new ArrayList<Person>();
    while(scan.hasNextLine())
    {
      Person p = new Person(scan.next(), 0);
      int r = nouns.getValue(scan.next());
      Person next = new Person(scan.next(), 0);

      if(!exists(p, tree))
      {
        tree.put(p);
      }
      if(!exists(next, tree)
      {
        tree.put(next);
      }

      if(r == 0)
      {
        p.gen = next.gen;
      }else {

      }

        if (r == 0)
        {
          next.gen = p.gen;
        }else {
          next.gen = p.gen-1;
        }
      }
    }

  }
  public static boolean exists(Person p, ArrayList list)
  {
    for (Person n : list)
    {
      if(p.name == n.name)
      {
        return true;
      }
    }
    return false;
  }

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


}
