public class Departamento {

    private double valorMeta;
    private double valorAtingidoMeta;

    public Departamento() { }

    public Departamento(double valorMeta, double valorAtingidoMeta) {
        setValorMeta(valorMeta);
        setValorAtingidoMeta(valorAtingidoMeta);
    }

    public double getValorMeta() {
        return valorMeta;
    }

    public void setValorMeta(double valorMeta) {
        this.valorMeta = valorMeta;
    }

    public double getValorAtingidoMeta() {
        return valorAtingidoMeta;
    }

    public void setValorAtingidoMeta(double valorAtingidoMeta) {
        this.valorAtingidoMeta = valorAtingidoMeta;
    }

    public boolean alcancouMeta() {
        return getValorAtingidoMeta() >= getValorMeta();
    }

}
