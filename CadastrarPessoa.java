import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CadastrarPessoa extends JFrame {

    private JLabel labelNome;
    private JLabel labelEmail;

    private JTextField textNome;
    private JTextField textEmail;

    private JButton buttonGravar;

    public CadastrarPessoa() {

        labelNome = new JLabel("Nome");
        labelEmail = new JLabel("Email");

        textNome = new JTextField(25);
        textEmail = new JTextField(25);

        buttonGravar = new JButton("Gravar ");
        Container pane = this.getContentPane();

        pane.setLayout(new GridLayout(4, 2));

        pane.add(labelNome);
        pane.add(textNome);

        pane.add(labelEmail);
        pane.add(textEmail);

        pane.add(buttonGravar);

        ActionListener handlerAction = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == buttonGravar) {
                    handleAction();
                }
            }
        };
        buttonGravar.addActionListener(handlerAction);
    
        
        this.setSize(200,100);
        this.setVisible(true);

    }

    private void handleAction() {
      Pessoa pessoa = new Pessoa(textNome.getText(), textEmail.getText());                
    }

}
