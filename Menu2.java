import java.awt.*;
import javax.swing.*;

public class Menu2 extends JFrame {

    MenuInicio button1 = new JButton("Cadastrar Pessoa");
    MenuInicio button2 = new JButton("Cadastrar Divida");
    MenuInicio button3 = new JButton("Consultar Provento");
    MenuInicio button4 = new JButton("Consultar Provento");
    MenuInicio button5 = new JButton("Consultar Provento");

    public Menu2() {

        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.CENTER));

        pane.add(button1);
        pane.add(button2);
        pane.add(button3);
        pane.add(button4);
        pane.add(button5);
        pane.add(button6);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 150);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Menu2 janela = new Menu2();
    }
}