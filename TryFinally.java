package Com.ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryFinally {
    public static void main(String[] args) throws NumberFormatException, IOException {
    
       System.out.print("Enter a number: ");
       
       BufferedReader bf = null;
        try
        {
            
            bf  = new BufferedReader(new InputStreamReader(System.in));

            int num = Integer.parseInt(bf.readLine());
            System.out.println(num);

        }
        finally
        {
            bf.close();
        }
    }
}
