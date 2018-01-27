import java.util.*;
import java.io.*;

class measurement {
  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(new File("measurement.in"));
    //PrintWriter out = new PrintWriter(new FileWriter("billboard.out"));
    Map<Integer, HashMap<String, Integer>> board = new TreeMap<Integer, HashMap<String, Integer>>();
    Map<String, Integer> cows = new HashMap<String, Integer>();
    cows.put("Bessie", 7);
    cows.put("Elsie", 7);
    cows.put("Mildred", 7);

    int lines = scan.nextInt();
    for (int i = 0; i < lines; i++)
    {
      int next = scan.nextInt();
      board.put(next, null);
      HashMap cow = new HashMap<String, Integer>();
      cow.put(scan.next(), scan.nextInt());
      board.set(next, cow);
    }

    for (int i = 0; i < lines; i++)
    {
      
    }
  }
}
