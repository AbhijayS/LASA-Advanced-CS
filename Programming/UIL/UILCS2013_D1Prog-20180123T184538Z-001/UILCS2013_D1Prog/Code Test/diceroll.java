import java.util.*;
import java.io.*;

class diceroll {
  public static void main(String[] args) throws Exception {
    long seed = 12354643225422L;
    Random r = new Random(seed);
    System.out.println(r.nextInt());
    System.out.println(r.nextInt());
  }
}
