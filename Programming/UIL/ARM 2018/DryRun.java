import java.util.*;
import java.io.*;

public class DryRun{
  public static void main(String[] args) throws FileNotFoundException {
    Scanner scan = new Scanner(new File("dryrun.dat"));
    int sets = scan.nextInt();
    scan.nextLine();
    for(int i = 0; i<sets; i++){
      System.out.println("I like "+scan.nextLine()+".");
    }
  }
}
