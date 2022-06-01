import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class NumerosDuplicados {

    public static TreeSet<Integer> buscar(int[] numeros) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<Integer>();

        for (int numero : numeros) {
            list.add(numero);
        }

        return list.stream().filter(x -> !set.add(x)).distinct().collect(Collectors.toCollection(TreeSet::new));
    }

}
