package modulo_1.classes.lista_7.ProdutoGUI;

// import modulo_1.classes.lista_7.View.*;
import modulo_1.classes.lista_7.Model.*;
// import modulo_1.classes.lista_7.Controller.*;
// import java.util.List;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CadastroProdutoGUI extends JFrame {
    private JTextField nomeField;
    private JTextField precoField;
    private JButton cadastrarButton;
    private String nome;
    private String preco;

    public CadastroProdutoGUI(){
        setTitle("Cadastro de Produto");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        
        setLayout(new GridLayout(4, 2, 5, 5));
        
        add(new JLabel("Nome:"));
        nomeField = new JTextField();
        add(nomeField);

        add(new JLabel("Preço:"));
        precoField = new JTextField();
        add(precoField);

        cadastrarButton = new JButton("Cadastrar");
        add(cadastrarButton);

        
        add(new JLabel(""));

        
        cadastrarButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                nome = nomeField.getText();
                preco = precoField.getText();

                if (nome.isBlank() || preco.isBlank()){
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
                } else {

                    JOptionPane.showMessageDialog(null,
                        "Produto cadastrado:\n" +
                        "Nome: " + nome +
                        "\nPreço: " + preco);
                        dispose();
                }
            }
        });

    }

    public Produto getProduto(){
        Produto aux = new Produto(0, nome, Double.parseDouble(preco));
        return aux;  
    }

}
