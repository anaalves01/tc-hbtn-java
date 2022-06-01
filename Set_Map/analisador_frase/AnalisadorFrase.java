import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class AnalisadorFrase {

    public static TreeMap<String, Integer> contagemPalavras(String frase) {
        TreeMap<String, Integer> tree = new TreeMap<>();
        ArrayList<String> array = new ArrayList<>();

        frase = frase.replace("?", "");
        frase = frase.replace("!", "");
        frase = frase.replace(".", "");

        String[] frases = frase.split(" ");
        for (String s : frases) {
            array.add(s.toLowerCase());
        }

        Collections.sort(array);
        for (int i = 0; i < array.size(); i++) {
            String palavra = array.get(i);
            tree.put(palavra, Collections.frequency(array, palavra));
        }

        return tree;
    }

}
