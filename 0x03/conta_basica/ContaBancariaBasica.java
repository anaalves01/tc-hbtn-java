import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {

    private String numeracao;
    private double saldo;
    private double taxaJurosAnual;

    public ContaBancariaBasica() { }

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        setNumeracao(numeracao);
        setTaxaJurosAnual(taxaJurosAnual);
        setSaldo(0);
    }

    public String getNumeracao() {
        return numeracao;
    }

    public void setNumeracao(String numeracao) {
        this.numeracao = numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public void setTaxaJurosAnual(double taxaJurosAnual) {
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public void depositar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0) {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        } 
        saldo += valor;
    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0) {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que 0");
        } else if (valor > saldo) {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }
        saldo -= valor;
    }

    public double calcularTarifaMensal() {
        if ((saldo * 0.10) < 10.0) {
            return saldo * 0.10;
        } else {
            return 10;
        }
    }

    public double calcularJurosMensal() {
        if (saldo > 0) {
            return saldo * ((taxaJurosAnual / 100) / 12);
        } else {
            return 0;
        }
    }

    public void aplicarAtualizacaoMensal() {
        saldo = (saldo + calcularJurosMensal()) - calcularTarifaMensal();
    }
    
}
