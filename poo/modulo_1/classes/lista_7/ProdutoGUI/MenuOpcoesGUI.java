package modulo_1.classes.lista_7.ProdutoGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuOpcoesGUI extends JFrame {
    private JTextField opfField;
    private JButton confirmarButton;
    private String op;
    
    public MenuOpcoesGUI(){
        setTitle("Menu de Opçoes");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(4,2,5,5));

        add(new JLabel("1 >> Adicionar Produto"));
        add(new JLabel("2 >> Listar Produtos"));
        add(new JLabel("0 >> Sair"));
        opfField = new JTextField();
        add(opfField);

        confirmarButton = new JButton("Confirmar");
        add(confirmarButton);

        add(new JLabel(""));

        confirmarButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                op = opfField.getText();

                if(op.isBlank() || Integer.parseInt(op) < 0 || Integer.parseInt(op) > 4){
                    JOptionPane.showMessageDialog(null, "Selecione uma opção válida");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Opção "+op+" selecionada");
                    dispose();
                }
            }
        });

        // setVisible(true);
    }

    public int getOp(){
        setVisible(true);
        while (!opfField.isEnabled()) {
            try { Thread.sleep(100); } catch (InterruptedException e) {}
        }
        try {
            return Integer.parseInt(opfField.getText());
        } catch (Exception e) {
            return -1;
        }
    }
}
