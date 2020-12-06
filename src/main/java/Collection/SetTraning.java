package Collection;

import java.util.HashSet;
import java.util.Set;

public class SetTraning {
    public static void trainSet (){
        String name1 = "Basia";
        String name2 = "Kacper";
        String name3 = "Janek";
        Set<String> uniqueNames = new HashSet<>();
        uniqueNames.add(name1);
        uniqueNames.add(name2);
        uniqueNames.add(name3);
        System.out.println(uniqueNames.size());
    }
}
