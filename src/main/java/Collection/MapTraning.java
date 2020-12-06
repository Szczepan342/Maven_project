package Collection;

import java.util.HashMap;
import java.util.Map;

public class MapTraning {
    public static void mapTraning() {
        String name1 = "Kazik";
        String name2 = "Wojtas";
        String name3 = "Mormon";
        Map<Integer, String> names = new HashMap<>();
        names.put(1, name1);
        names.put(2, name2);
        names.put(3, name3);
        printMap(names);
        System.out.println(names.size());
        names.put (1 , name2);
        printMap(names);
        System.out.println(names.size());

    }
    public static void printMap(Map<Integer, String> mapnames)
    {
        for(Map.Entry<Integer,String> entry:mapnames.entrySet()){
            System.out.println(entry.getKey()+ "      " + entry.getValue());
        }

    }
}
