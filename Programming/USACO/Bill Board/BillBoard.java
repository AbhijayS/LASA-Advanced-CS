import java.util.*;
import java.io.*;

class Board{
  public int x1, y1, x2, y2;
  public static int tt, rr, bb, ll;
  public int hig, wid;
  Board(int x1, int y1, int x2, int y2)
  {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
    hig = this.y2-this.y1;
    wid = this.x2-this.x1;
  }

  public String toString()
  {
    return("x1: " + x1 + "; y1: " + y1 + "; x2: " + x2 + "; y2: " + y2);
  }

  public int area()
  {
    return hig*wid;
  }
}
class BillBoard {
  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(new File("billboard.in"));
    PrintWriter out = new PrintWriter(new FileWriter("billboard.out"));
    //out.println("Hello");
    int x1L, y1L, x1U, y1U, x2L, y2L, x2U, y2U;
    int[][] game = new int[4][4];
    Board lb = new Board(scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt());
    Board cfb = new Board(scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt());
    lb.tt = cfb.y2 - lb.y2;
    lb.rr = cfb.x2 - lb.x2;
    lb.bb = -1*(cfb.y1 - lb.y1);
    lb.ll = -1*(cfb.x1 - lb.x1);
    p(lb);
    p(cfb);
    p(lb.tt);
    p(lb.rr);
    p(lb.bb);
    p(lb.ll);
    int area;

    if ((lb.tt > 0) && (lb.rr > 0) && (lb.bb > 0) && (lb.ll > 0))
    {
      p(0);
      p("Enclosed");
      out.println(0);

    }else if ((lb.tt >= lb.hig) || (lb.rr >= lb.wid) || (lb.bb >= lb.hig) || (lb.ll >= lb.wid))
    {
      p(lb.area());
      p("Ignore");
      out.println(lb.area());
    }else if ((lb.tt >= 0) && (lb.rr >= 0) && (lb.ll >= 0) && (lb.bb < 0))
    {
      area = Math.abs(lb.bb)*lb.wid;
      p(area);
      p("Subtraction 1");
      out.println(area);
    }else if ((lb.tt < 0) && (lb.rr >= 0) && (lb.ll >= 0) && (lb.bb >= 0))
    {
      area = Math.abs(lb.tt)*lb.wid;
      p(area);
      p("Subtraction 2");
      out.println(area);
    }else if ((lb.tt >= 0) && (lb.rr < 0) && (lb.ll >= 0) && (lb.bb >= 0))
    {
      area = Math.abs(lb.rr)*lb.hig;
      p(area);
      p("Subtraction 3");
      out.println(area);
    }else if ((lb.tt >= 0) && (lb.rr >= 0) && (lb.ll < 0) && (lb.bb >= 0))
    {
      area = Math.abs(lb.ll)*lb.hig;
      p(area);
      p("Subtraction 4");
      out.println(area);
    }else{
      area = lb.area();
      p(area);
      out.println(area);
    }
    out.close();
/*
    p(x1L);
    p(y1L);
    p(x1U);
    p(y1U);
    p(x2L);
    p(y2L);
    p(x2U);
    p(y2U);
    */
  }

  //public static int area(int x1, int y1, int x2, int y2){};
  public static <T> void p(T arr)
  {
    System.out.println(arr);
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

  public static int area(int x1, int y1, int x2, int y2) {
      return Math.abs((x2-x1)*(y2-y1));
  }

  public static int subArea (Board b, Board a)
  {
    return Math.abs(area(b.x1, b.y1, b.x2, b.y2)-area(a.x1, a.y1, a.x2, a.y2));
  }
}
