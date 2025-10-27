package modulo_1.classes.lista_7.View;
import modulo_1.classes.lista_7.Model.*;// importa todos os arquivos do pacote model
import java.util.List;
// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;


public class ProdutoView {


    public void mostrarProduto(Produto produto){
        if(produto != null)
            System.out.println(produto.toString());
        else
            mostrarMensagem("Produto não encontrado");
    }
    
    public void listarProdutos(List<Produto> produtos){
        for(Produto i : produtos){
            System.out.println(i.toString());
        }
    }

    public void mostrarMensagem(String mensagem){
        System.out.println(mensagem);
    }
    
}
