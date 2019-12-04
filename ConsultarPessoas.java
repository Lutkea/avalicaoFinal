import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultarPessoas extends JFrame {

    private JTextArea textArea2 = new JTextArea(10, 30);

    public ConsultarPessoas() {

        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.CENTER));

        pane.add(textArea2);
        textArea2.setText(selectPeople());

        this.setSize(300, 300);
        this.setVisible(true);

    }

    private String selectPeople() {
        Connection conexao;
        String ret = "";
        try {
            conexao = Conexao.getConnection();

            String sql = "SELECT * FROM pessoas";
            Statement estado = conexao.createStatement();
            ResultSet resultados = estado.executeQuery(sql);
        
            while(resultados.next()){
                ret += "Nome: " + resultados.getString("nome") + "\nEmail: " + resultados.getString("email") + "\n";
            }
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ret;
    }

}
