package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_traning {
    public static void trainList () {
        String name1 = "Mateusz";
        String name2 = "Marek";
        String name3 = "Kasia";
        List<String> names = new LinkedList<>();
//        ArrayList<String> names = new ArrayList <> (); drugi sposób na inplemenotowanie listy
        names.add(name1);
        names.add(name2);
        names.add(name3);
        System.out.println(names.size());
        names.add(name1);
        System.out.println(names.size());
    }
}
