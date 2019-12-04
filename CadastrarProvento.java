import java.awt.*;
import javax.swing.*;

public class CadastrarProvento extends JFrame {

    JLabel labelPessoa = new JLabel("Pessoa:");
    JLabel labelmes = new JLabel("Informe o mes:");
    JLabel labelAno = new JLabel("Informe o Ano:");
    JLabel labelValor = new JLabel("Valor:");
    JLabel labelDesconto = new JLabel("Desconto:");

    JTextField textPessoa = new JTextField(25);
    JTextField textMes = new JTextField(25);
    JTextField textAno = new JTextField(25);
    JTextField textValor = new JTextField(25);
    JTextField textDesconto = new JTextField(25);

    JButton buttonGravar = new JButton("Gravar");


    JComboBox<String> comboMes = new JComboBox<>();

    public CadastrarProvento(){
        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        pane.add(labelPessoa);
        pane.add(textPessoa);

        pane.add(labelAno);
        pane.add(textAno);

        pane.add(labelmes);

        comboMes.addItem("Janeiro");
        comboMes.addItem("Fevereiro");
        comboMes.addItem("Março");
        comboMes.addItem("Abril");
        comboMes.addItem("Maio");
        comboMes.addItem("Junho");
        comboMes.addItem("Julho");
        comboMes.addItem("Agosto");
        comboMes.addItem("Setembro");
        comboMes.addItem("Outubro");
        comboMes.addItem("Novembro");
        comboMes.addItem("Dezembro");

        pane.add(comboMes);

        pane.add(labelValor);
        pane.add(textValor);

        pane.add(labelDesconto);
        pane.add(textDesconto);

        pane.add(buttonGravar);
        
        this.setSize(300,270);
        this.setResizable(false);
        this.setVisible(true);
    }

    private void handleAction() {
        Proventos provento = new Proventos();                
      }
  
}