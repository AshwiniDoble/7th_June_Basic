package Com.StreamAPI01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Malisandre","Sana","Jon","Daenerys","Joffery");
        List<String> longNames = new ArrayList<String>(); 

       /*longNames = names.stream().filter(str->str.length()>6 && str.length()<8).collect(Collectors.toList());
        System.out.println(longNames);*/ 

        //names.stream().filter(str->str.length()>6 && str.length()<8).forEach(str->Syetem.out.println());

        names.stream().filter(str->str.length()>6 && str.length()<8).forEach(System.out::println);
    }
}
