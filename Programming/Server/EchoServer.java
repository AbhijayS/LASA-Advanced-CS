import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
import java.io.*;

class EchoServer
{

  public static void main(String[] args) {

    try
    {
      p("Waiting for clients ...\n");
      ServerSocket ssoc = new ServerSocket(Integer.parseInt(args[0]));//8000
      Socket csoc = ssoc.accept();
      p("Connection established!\n");
      Scanner scan = new Scanner(csoc.getInputStream());
      String in = scan.nextLine();
      PrintWriter out = new PrintWriter(csoc.getOutputStream(), true);
      p("Server: " + in+"\n");
      out.println(in);
    }
    catch(IOException e)
    {
      p("Couldn't recieve I/O\n");
    }
    catch(Exception e)
    {
      p("Server-Side Error\n");
    }
    /*
    String inputLine;
    while((inputLine = in.nextLine()) != null)
    {
      p(inputLine+"\n");
      */
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
