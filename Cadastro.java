import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cadastro extends JFrame {

    private final JMenuItem menuItemAbrir = new JMenuItem("Abrir ");
    private final JMenuItem menuItemNovo = new JMenuItem("Novo");
    private final JMenuItem menuItemSalvar = new JMenuItem("Salvar");
    private final JMenuItem menuItemFechar = new JMenuItem("Fechar");

    private final JMenuItem menuItemColar = new JMenuItem("Colar");
    private final JMenuItem menuItemCopiar = new JMenuItem("Copiar");
    private final JMenuItem menuItemRecortar = new JMenuItem("Recortar");

    private final JMenuItem menuItemSubstituir = new JMenuItem("Substituir");
    private final JMenuItem menuItemLocalizar = new JMenuItem("Localizar");

    private final JMenu menuArquivo = new JMenu("Arquivo");

    private final JMenu menuEditar = new JMenu("Editar");

    private final JMenuBar menuBar = new JMenuBar();

    private final JButton button1 = new JButton("Ja Tenho cadastro");
    private final JButton button2 = new JButton("Novo cadastro");
    private final JButton button3 = new JButton("Fechar");
    private final JButton button4 = new JButton("Entrar");
    private final JButton button5 = new JButton("Cadastrar");

    public Cadastro() {

        menuArquivo.add(menuItemAbrir);
        menuArquivo.add(menuItemNovo);
        menuArquivo.add(menuItemSalvar);
        menuArquivo.addSeparator();
        menuArquivo.add(menuItemFechar);

        menuEditar.add(menuItemColar);
        menuEditar.add(menuItemCopiar);
        menuEditar.add(menuItemRecortar);
        menuEditar.addSeparator();
        menuEditar.add(menuItemLocalizar);
        menuEditar.add(menuItemSubstituir);

        menuBar.add(menuArquivo);
        menuBar.add(menuEditar);

        final Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.CENTER));

        pane.add(button1);
        pane.add(button2);
        pane.add(button3);

        button1.setBounds(10, 30, 100, 22);
        button2.setBounds(10, 60, 100, 22);
        button3.setBounds(10, 60, 100, 22);

        final ActionListener handlerAction = new ActionListener() {
            public void actionPerformed(final ActionEvent event) {
                methodAction(event);
            }
        };
        button1.addActionListener(handlerAction);
        button2.addActionListener(handlerAction);
        button3.addActionListener(handlerAction);

        this.setJMenuBar(menuBar);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(310, 200);
        this.setVisible(true);
    }

    public static void main(final String[] args) {
        final Cadastro janela = new Cadastro();
    }

    private void methodAction(final ActionEvent e) {
        if (e.getSource() == button1) {
            cadastradoUsuario();

        } else if (e.getSource() == button2){

            
        }else if (e.getSource() == button3) {
            final int ret = JOptionPane.showConfirmDialog(this, "Deseja Fechar?", "Fechar",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (ret == JOptionPane.OK_OPTION) {
                System.exit(0);
            }
        }
    }   

    public void cadastradoUsuario() {

        final JLabel labelNome = new JLabel("Nome");
        final JLabel labelSenha = new JLabel("Senha");

        final JTextField textNome = new JTextField(25);
        final JTextField textSenha = new JTextField(25);

        //textSenha.setEchoChar('*');

        final JScrollPane paneComent = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        final Container pane = this.getContentPane();

        pane.setLayout(new FlowLayout(FlowLayout.LEFT));

        pane.add(labelNome);
        pane.add(textNome);
        pane.add(labelSenha);
        pane.add(textSenha);
        pane.add(button4);

        final ActionListener handlerAction = new ActionListener() {
            public void actionPerformed(final ActionEvent event) {
                new Usuario(
                    textNome.getText(),
                    textSenha.getText(),
                    textNome.getText(),
                    true
                );
            }
        };
        button4.addActionListener(handlerAction);
      
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(310,380);
        this.setResizable(false);
        this.setVisible(true);


    }


    
    
}