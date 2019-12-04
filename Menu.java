import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {

    JButton button1 = new JButton("Cadastrar Pessoa");
    JButton button2 = new JButton("Cadastrar Divida");
    JButton button3 = new JButton("Cadastrar Provento");
    JButton button4 = new JButton("Consultar Pessoa");
    JButton button5 = new JButton("Consular Divida");
    JButton button6 = new JButton("Consultar Provento");

    public Menu() {

        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.CENTER));

        pane.add(button1);
        pane.add(button2);
        pane.add(button3);
        pane.add(button4);
        pane.add(button5);
        pane.add(button6);

        ActionListener handlerAction = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(e.getSource() == button1){
                    new CadastrarPessoa();
                }if(e.getSource() == button2){
                    new CadastrarDivida();
                }if(e.getSource() == button3){
                    new CadastrarProvento();
                }if(e.getSource() == button4){
                    new ConsultarPessoas();
                }if(e.getSource() == button5){
                    new ConsultarDivida();
                }else if(e.getSource() == button6){
                    new ConsultarProvento();  
                }
                }

            
        };
        button1.addActionListener(handlerAction);
        button2.addActionListener(handlerAction);
        button3.addActionListener(handlerAction);
        button4.addActionListener(handlerAction);
        button5.addActionListener(handlerAction);
        button6.addActionListener(handlerAction);

        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(200,250);
        this.setVisible(true);

    }
}