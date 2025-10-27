package modulo_1.classes.lista_7.Model;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {
    private List<Produto>produtos = new ArrayList<Produto>();
    private int produto_id = 1;

    public void adicionarProduto(String nome, double preco){
        this.produtos.add(new Produto(produto_id++, nome, preco));
    }

    public List<Produto> listarProdutos(){
        return produtos;
    }

    public boolean atualizarPreco(int id, double preco){
        for(Produto i : produtos){
            if(i.getId() == id){
                i.setPreco(preco);
                return true;
            }
        }
        return false;
    }

    public boolean removerProduto(int id){
        return produtos.removeIf(u -> u.getId() == id);
    }

    public Produto buscarPorId(int id){
        for(Produto i : produtos){
            if(i.getId() == id)
                return i;
        }
        return null;
    }

    public int produtosSize(){
        return produtos.size();
    }

}
