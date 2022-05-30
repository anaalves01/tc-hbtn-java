import java.util.List;

public class ManipularArrayNumeros {

    public static int buscarPosicaoNumero(List<Integer> numeros, int numero) {
        return numeros.indexOf(numero);
    }

    public static void adicionarNumero(List<Integer> numeros, int numero) throws Exception {
        int posicao = buscarPosicaoNumero(numeros, numero);
        
        if (posicao > 0)
            throw new Exception("Numero jah contido na lista");

        numeros.add(numero);
    }

    public static void removerNumero(List<Integer> numeros, int numero) throws Exception {
        int posicao = buscarPosicaoNumero(numeros, numero);
        
        if (posicao < 0)
            throw new Exception("Numero nao encontrado na lista");
        
        numeros.remove(posicao);
    }

    public static void substituirNumero(List<Integer> numeros, int numeroSubstituir, int numeroSubstituto) {
        int posicao = buscarPosicaoNumero(numeros, numeroSubstituir);
        
        if (posicao < 0) {
            numeros.add(numeroSubstituto);
        } else {
            numeros.set(posicao, numeroSubstituto); 
        }
    }
    
}
