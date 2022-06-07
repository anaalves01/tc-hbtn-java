public class Empregado {

    private double salarioFixo;

    public Empregado() { }

    public Empregado(double salarioFixo) {
        setSalarioFixo(salarioFixo);
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double calcularBonus(Departamento departamento) {
        if (departamento.alcancouMeta()) {
            return getSalarioFixo() * 0.1;
        } else {
            return 0;
        }
    }

    public double calcularSalarioTotal(Departamento departamento) {
        return calcularBonus(departamento) + getSalarioFixo();
    }

}
