import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Divida extends Contas {
    
        double percentualDesconto;

        public Divida(int id){
    
        }
      
        public Divida(int id, int mes, int ano, double valor, Pessoa pessoa, double percentualDescontos) {
            super(id, mes, ano, valor, pessoa);
            this.percentualDesconto = percentualDesconto;
            pessoa.divida.add(this);
        }

        public Divida(int id, int mes, int ano, double valor){
            this(0, mes, ano, valor);
            Connection conexao;
            try {
                conexao = Conexao.getConnection();
                String sql = "INSERT INTO pessoas (mes, ano, valor) VALUES (?,?,?)";
                PreparedStatement estado = conexao.prepareStatement(sql);
                estado.setInt( 1, mes);
                estado.setInt( 2, ano);
                estado.setDouble( 3, valor);
                estado.execute();
                conexao.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        

    public double getPercentualDesconto() {
        return this.percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public Divida percentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Divida)) {
            return false;
        }
        Divida divida = (Divida) o;
        return percentualDesconto == divida.percentualDesconto;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(percentualDesconto);
    }

    @Override
    public String toString() {
        return "{" +
            " percentualDesconto='" + getPercentualDesconto() + "'" +
            "}";
    }

    public double calculaDesconto(){
        double result;
        double valor = getValor();
        double desconto = getPercentualDesconto();
        result = valor + (valor*desconto);

        return result;
    }
}


