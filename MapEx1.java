package Com.Collection01;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();

        students.put("Navin", 56);
        students.put("Harsh", 76);
        students.put("Kiran", 48);
        students.put("Punam", 90);

        System.out.println(students.keySet());

        for(String key:students.keySet())
        {
            System.out.println(key + " "+students.get(key));
        }
    }
}
