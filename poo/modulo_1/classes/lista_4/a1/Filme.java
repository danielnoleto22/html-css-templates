package modulo_1.classes.lista_4.a1;

public class Filme extends Midia{
    int duracao;

    public Filme (String titulo, int codigo, int anoLancamento, int duracao){
        super(codigo, titulo, anoLancamento);
        this.duracao = duracao;
    }

    public int getDuracao(){
        return duracao;
    }

    public void setDuracao(int duracao){
        this.duracao = duracao;
    }

    public String toString(){
        return "Tipo: Filme\n"+super.toString()+"Duração: "+duracao;
    }
}
