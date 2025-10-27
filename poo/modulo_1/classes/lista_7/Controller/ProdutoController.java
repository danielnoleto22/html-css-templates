package modulo_1.classes.lista_7.Controller;

import modulo_1.classes.lista_7.View.*;
import modulo_1.classes.lista_7.Model.*;
import java.util.List;

public class ProdutoController {
    
    private ProdutoDAO dao;
    private ProdutoView view;
    // private Produto produto;

    public ProdutoController(ProdutoDAO dao, ProdutoView view){
        this.dao = dao;
        this.view = view;
    }

    public void criarProduto(String nome, double preco){
        if(nome != null && preco > 0){
            dao.adicionarProduto(nome, preco);
            view.mostrarMensagem("Produto adicionado com Sucesso!");
        }
        else{
            view.mostrarMensagem("Erro ao Adicionar o Produto");
        }
    }

    public void listar(){
        if(dao.produtosSize() > 0){
            List<Produto>produtos = dao.listarProdutos();
            view.listarProdutos(produtos);
        }
        else view.mostrarMensagem("Não há Produtos");
    }
    
    public void atualizarPreco(int id, double preco){
        if(dao.buscarPorId(id) != null){
            dao.atualizarPreco(id, preco);
            view.mostrarMensagem("Preço Atualizado com Sucesso!");
        }
        else{
            view.mostrarMensagem("Erro ao Atualizar o Preço!");
        }
    }

    public void deletarProduto(int id){
        if(dao.buscarPorId(id) != null){
            dao.removerProduto(id);
            view.mostrarMensagem("Produto Removido com Sucesso!");
        }
        else{
            view.mostrarMensagem("Erro ao Remover o Produto");
        }
    }

    public void buscarProdutos(int id){
        view.mostrarProduto(dao.buscarPorId(id));
    }

}
