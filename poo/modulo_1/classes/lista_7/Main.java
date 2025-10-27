package modulo_1.classes.lista_7;

import java.util.Scanner;
// import modulo_1.classes.lista_7.View.*;
import modulo_1.classes.lista_7.Model.*;
// import modulo_1.classes.lista_7.Controller.*;
import modulo_1.classes.lista_7.ProdutoGUI.*;
// import java.util.List;
// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;


public class Main {
    

    public static void main(String[] args){
        
        //desenvolver menu de interação com usuário

        Scanner scanner = new Scanner(System.in);
        ProdutoDAO dao = new ProdutoDAO();
        // ProdutoView view = new ProdutoView();
        // ProdutoController controller = new ProdutoController(dao, view);
        CadastroProdutoGUI cadastro = new CadastroProdutoGUI();
        MenuOpcoesGUI menu = new MenuOpcoesGUI();
        ListarProdutosGUI listar = new ListarProdutosGUI(dao);
        
        int op = -1;
        
        while(op != 0){

            menu.setVisible(true);
            op = menu.getOp();
            
            switch(op){
                
                case 1:
                
                    cadastro.setVisible(true);
                    Produto aux = cadastro.getProduto();
                    dao.adicionarProduto(aux.getNome(), aux.getPreco());
                
                    break;

                case 2:

                    listar.setVisible(true);
                    break;

                default:
                    break;


            }
        }

        scanner.close();

    }
}
