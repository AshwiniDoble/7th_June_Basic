package Com.ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputEx1 {
   public InputEx1() {
   }

   public static void main(String[] arg) throws IOException {
      System.out.println("Enter the number: ");
      
      InputStreamReader in = new InputStreamReader(System.in);
      BufferedReader bf = new BufferedReader(in);
      
      int num = Integer.parseInt(bf.readLine());
      System.out.println(num);

      bf.close();
   }
}
