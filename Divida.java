import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Divida {

    Double percentualDesconto;

    public Divida() {
    }

    public Divida(Double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }
    public Divida(int mes, int ano, double valor, int pessoas_id, double percentualDesconto){
        this(percentualDesconto);
        Connection conexao;
        try {
            conexao = Conexao.getConnection();
            String sql = "INSERT INTO Divida (mes, ano, valor, id, percentual de Desconto) VALUES (?,?,?,?,?,?)";
            PreparedStatement estado = conexao.prepareStatement(sql);
            estado.setDouble( 1, percentualDesconto);
            estado.execute();
            conexao.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        
    }


    public Double getPercentualDesconto() {
        return this.percentualDesconto;
    }

    public void setPercentualDesconto(Double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public Divida percentualDesconto(Double percentualDesconto) {
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
        return Objects.equals(percentualDesconto, divida.percentualDesconto);
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
}