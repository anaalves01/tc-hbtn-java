package inteiro_positivo;

public class InteiroPositivo {

    private int valor;

    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) throws IllegalArgumentException {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        } else {
            this.valor = valor;
        }
    }

    public InteiroPositivo(int valor) {
        this.setValor(valor);
    }

    public InteiroPositivo(String valor) {
        int converteValor = Integer.parseInt(valor);
        this.setValor(converteValor);
    }

    public boolean ehPrimo() {
        int valorEhPrimo = this.getValor();

        if (valorEhPrimo <= 1) 
            return false;

        for (int i = 2; i < valorEhPrimo; i++)
            if (valorEhPrimo % i == 0)
                return false;

        return true;
    }
    
}
