import javax.swing.*;
import java.awt.*;

public class ConsultarPessoas extends JFrame {

    public ConsultarPessoas(){

        JLabel nameLabel = new JLabel("Nome");
        JLabel emailJLabel = new JLabel("email");

        JTextField textNome = new JTextField(25);
        JTextField textEmail = new JTextField(25);

        Container pane = this.getContentPane();
        pane.setLayout(new GridLayout(4,3));

        pane.add(nameLabel);
        pane.add(textNome);

        pane.add(emailJLabel);
        pane.add(textEmail);

        this.setSize(300,100);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        ConsultarPessoas consulta = new ConsultarPessoas();
    }

}