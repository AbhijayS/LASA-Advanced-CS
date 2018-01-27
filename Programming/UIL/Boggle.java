import java.lang.*;
import java.util.*;
import java.io.*;

class Boggle{

  public static <T> void p(T ar)
  {
    System.out.print(ar);
  }

  public static void main(String[] args) throws FileNotFoundException{
    Scanner scan = new Scanner(new File("boggle.dat"));
    int games  = (scan.nextInt());
    char[][] game= new char[4][4];
    String word;
    Map<Integer, Integer> crds = new HashMap<Integer, Integer>();

// Assign Grid to games
    for (int i = 0; i < games; i++)
    {
      for (int j = 0; j < 4; j++)
      {
        for (int k = 0; k < 4; k++)
        {
          game[i][j] = scan.nextInt();
        }
      }

      int words = scan.nextInt();

      // Find words in the game board
      for (int j = 0; j < words; j++)
      {
        word = scan.next();
        for (int k = 0; k < word.length(); k++)
        {

        }
      }
    }
  }
}
