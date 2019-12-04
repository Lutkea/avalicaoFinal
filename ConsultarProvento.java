import javax.swing.*;
import java.awt.*;

public class ConsultarProvento extends JFrame {
    
    private JLabel labelNomePagador;
    private JLabel labelMesAno;
    private JLabel labelValor;
    private JLabel labelImposto;
    
    public ConsultarProvento(){ 

        JLabel labelNomePagador= new JLabel("Nome do Credor: ");
        JLabel labelMesAno = new JLabel("Mes/Ano");
        JLabel labelValor = new JLabel("Valor: ");
        JLabel labelImposto = new JLabel("Imposto: ");
         
        JTextField textNomePagador = new JTextField(100);
        JTextField textMesAno = new JTextField(25);
        JTextField textValor = new JTextField(25);
        JTextField textImposto= new JTextField(25);

        Container pane = this.getContentPane();

        pane.setLayout(new GridLayout(4,2));
        

        pane.add(labelNomePagador);
        pane.add(textNomePagador);

        pane.add(labelMesAno);
        pane.add(textMesAno);

        pane.add(labelValor);
        pane.add(textValor);

        pane.add(labelImposto);
        pane.add(textImposto);

        this.setSize(270,200);
        this.setVisible(true);

    }

}
