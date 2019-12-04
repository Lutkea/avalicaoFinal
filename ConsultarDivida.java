import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConsultarDivida extends JFrame {
    
    private JLabel labelNome;
    private JLabel labelMesAno;
    private JLabel labelValor;
    private JLabel labelDesconto;

    
    public ConsultarDivida(){ 

        JLabel labelNome = new JLabel("Nome do Credor: ");
        JLabel labelMesAno = new JLabel("Mes/Ano");
        JLabel labelValor = new JLabel("Valor: ");
        JLabel labelDesconto = new JLabel("Desconto: ");
         
        JTextField textNome = new JTextField(100);
        JTextField textMesAno = new JTextField(25);
        JTextField textValor = new JTextField(25);
        JTextField textDesconto = new JTextField(25);


        Container pane = this.getContentPane();

        pane.setLayout(new GridLayout(4,2));
        

        pane.add(labelNome);
        pane.add(labelNome);

        pane.add(labelNome);
        pane.add(textNome);

        this.setSize(200,100);
        this.setVisible(true);

        
    }

}
