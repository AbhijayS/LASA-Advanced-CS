import java.util.*;
import java.io.*;
public class Bus {
   public static void main(String[] args) throws FileNotFoundException {
      Scanner scan = new Scanner(new File("bus.dat"));
      int busNum = scan.nextInt();
      scan.nextLine();
      for (int i = 0; i < busNum; i++) {
         String bus = scan.nextLine();
         String[] temp = bus.split(" ");
         int[] arr = new int[temp.length];
         for (int j = 0; j < temp.length; j++) {
            arr[j] = Integer.parseInt(temp[j]);
         }
         
         int min = Integer.MAX_VALUE;
         int people = arr[0];
         ArrayList stops = new ArrayList();

         for (int j = 1; j < arr.length; j+=2) {
            people += (arr[j] + arr[j+1]);
            stops.add(people);
            if (people < min) {
               min = people;
            }
         }
         
         people = arr[0];
         
         ArrayList results = new ArrayList();
         String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
         for (int j = 0; j < stops.size(); j++) {
            if ((int)stops.get(j) == min) {
               results.add(letters.charAt(j+1));
            }
         }
         
         Collections.sort(results);
         
         for (int j = 0; j < results.size(); j++) {
            System.out.print(results.get(j));
            System.out.print(" ");
         }
         System.out.print(min);
         System.out.println();
      }
   }


}