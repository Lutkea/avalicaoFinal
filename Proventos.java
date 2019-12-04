public class Proventos extends Contas{
    double imposto;

    public Proventos() {
    }

    public Proventos(int id, int mes, int ano, double valor, Pessoa pessoa, double imposto) {
        this.imposto = imposto;
    }

    public double getImposto() {
        return this.imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public Proventos imposto(double imposto) {
        this.imposto = imposto;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Proventos)) {
            return false;
        }
        Proventos proventos = (Proventos) o;
        return imposto == proventos.imposto;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(imposto);
    }

    @Override
    public String toString() {
        return "{" +
            " imposto='" + getImposto() + "'" +
            "}";
    }
}