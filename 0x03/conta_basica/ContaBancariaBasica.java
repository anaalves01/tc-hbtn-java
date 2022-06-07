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
        setSaldo(getSaldo() + valor);
    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0) {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que 0");
        } else if (valor > getSaldo()) {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }
        setSaldo(getSaldo() - valor);
    }

    public double calcularTarifaMensal() {
        if ((getSaldo() * 0.10) < 10.0) {
            return getSaldo() * 0.10;
        } else {
            return 10;
        }
    }

    public double calcularJurosMensal() {
        if (getSaldo() > 0) {
            return getSaldo() * ((getTaxaJurosAnual() / 100) / 12);
        } else {
            return 0;
        }
    }

    public void aplicarAtualizacaoMensal() {
        setSaldo((getSaldo() + calcularJurosMensal()) - calcularTarifaMensal());
    }
    
}
