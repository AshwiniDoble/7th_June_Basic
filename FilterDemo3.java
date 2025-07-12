package Com.StreamAPI01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("cup", null, "forest", null, "sky","book","Theatre");
        //List<String> resultVariable = new ArrayList<String>();

        List<String> result =words.stream().filter(w-> w!=null).collect(Collectors.toList());
        System.out.println(result);

    }
    
}
