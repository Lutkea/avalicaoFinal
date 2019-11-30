import java.awt.*;
import javax.swing.*;

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

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(200,250);
        this.setVisible(true);
    }

    public static void main(String[] args){
        Menu janela = new Menu();
    }
}