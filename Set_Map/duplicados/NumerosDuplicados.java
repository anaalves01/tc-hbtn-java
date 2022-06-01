import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class NumerosDuplicados {

    public static TreeSet<Integer> buscar(int[] numeros) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<Integer>();
        TreeSet<Integer> tree = new TreeSet<Integer>();

        for (int i = 0; i < numeros.length; i++) {
            list.add(numeros[i]);
        }

        Set<Integer> set2 = list.stream().filter(x -> !set.add(x)).collect(Collectors.toSet());
        for (Integer num : set2) {
            tree.add(num);
        }

        return tree;
    }
    
}
