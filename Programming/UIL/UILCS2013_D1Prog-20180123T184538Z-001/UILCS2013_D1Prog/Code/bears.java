import java.lang.*;
import java.util.*;
import java.io.*;

class bears{
  public static void main(String[] args) throws FileNotFoundException{
    Scanner scan = new Scanner(new File("bears.dat"));
    int num = scan.nextInt();

    for (int i = 0; i < num; i++)
    {
      char[][] board = new char[10][10];
      for(int j = 0; j < 10; j++)
      {
        String in = scan.next();
        for (int k = 0; k < 10; k++)
        {
          board[j][k] = in.charAt(k);
        }
      }
      System.out.println(countChar('B', board));
    }

  }

  public static int countChar(char c, char[][] arr)
  {
    int count = 0;
    for (int i = 0; i < arr.length; i++)
    {
      for(int j = 0; j < arr[i].length; j++)
      {
        if(arr[i][j] == c)
        {
          count++;
        }
      }
    }
    return count;
  }
}
