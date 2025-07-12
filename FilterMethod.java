package Com.StreamAPI01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMethod {
    public static void main(String[] args) {
        /*ArrayList<Integer> numberList = new ArrayList<Integer>();
        
        numberList.add(10);
        numberList.add(23);
        numberList.add(30);
        numberList.add(45);*/

        List<Integer> numberList = Arrays.asList(10,23,30,45,56,64); 
        List<Integer> evenNumbersList = new ArrayList<Integer>();

        //Without using streams
        /*for(int n: numberList)
        {
            if(n%2==0)
                evenNumbersList.add(n);
        }
        System.out.println(evenNumbersList);*/

        //With Stream
        /*evenNumbersList = numberList.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(evenNumbersList);*/

        /*numberList.stream().filter(n -> n%2==0).forEach(n->System.out.println(n););*/
        numberList.stream().filter(n-> n%2==0).forEach(System.out::println);
    }
}
