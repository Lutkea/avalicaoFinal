import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Pessoa{
    private int id;
    private String nome;
    private String email;


    public Pessoa() {
    }

    public Pessoa(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }
    public Pessoa(String nome, String email){
        this(0, nome, email);
        Connection conexao;
        try {
            conexao = Conexao.getConnection();
            String sql = "INSERT INTO pessoas (nome, email) VALUES (?,?)";
            PreparedStatement estado = conexao.prepareStatement(sql);
            estado.setString( 1, nome);
            estado.setString(2, email);
            estado.execute();
            conexao.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Pessoa id(int id) {
        this.id = id;
        return this;
    }

    public Pessoa nome(String nome) {
        this.nome = nome;
        return this;
    }

    public Pessoa email(String email) {
        this.email = email;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pessoa)) {
            return false;
        }
        Pessoa pessoa = (Pessoa) o;
        return id == pessoa.id && Objects.equals(nome, pessoa.nome) && Objects.equals(email, pessoa.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, email);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nome='" + getNome() + "'" +
            ", email='" + getEmail() + "'" +
            "}";
    }

    
}