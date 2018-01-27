import java.net.Socket;
import java.util.*;
import java.io.*;

class EchoClient
{
  public static void main(String[] args) {

    try
    {
      p("Client started ...\n");
      Socket soc = new Socket(args[0], Integer.parseInt(args[1]));//localhost, 8000
      Scanner scan = new Scanner(System.in);
      PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
      p("Enter Data: ");
      String in = scan.nextLine();
      out.println(in);
      scan = new Scanner(soc.getInputStream());
      in = scan.nextLine();
      p(in+"\n");
    }
    catch(Exception e){
      p("Client-End Issue\n");
    }
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
