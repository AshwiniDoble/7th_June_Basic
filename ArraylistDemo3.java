package Com.Collection01.ArrayList0;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistDemo3 {
    public static void main(String[] args) {
        String arr[] = {"Dog", "Cat", "Elephant"};

        for(String value:arr)
        {
            System.out.println(value);
        }

        ArrayList al = new ArrayList(Arrays.asList(arr));
        System.out.println(al);
    }
}
