package modulo_1.classes.lista_7.ProdutoGUI;

// import modulo_1.classes.lista_7.View.*;
import modulo_1.classes.lista_7.Model.*;
// import modulo_1.classes.lista_7.Controller.*;
// import java.util.List;

import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;

public class ListarProdutosGUI extends JFrame{
    // JFrame frame = new JFrame("Listar Produtos");
    // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // frame.setSize(300,200);

    public ListarProdutosGUI(ProdutoDAO dao){
        setTitle("Listar Produtos");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JList<Produto>lista = new JList<>(dao.listarProdutos().toArray(new Produto[0]));        

        JScrollPane scrollPane = new JScrollPane(lista);

        add(scrollPane);

        // setVisible(true);

    }
}
