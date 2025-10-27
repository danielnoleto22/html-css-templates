package modulo_1.classes.lista_4.a1;

public class Episodio {
    private int codigo;
    private String titulo;
    private int duracao;

    public Episodio(int codigo, String titulo, int duracao){
        this.codigo = codigo;
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public String getTitulo(){
        return titulo;
    }

    public int getCodigo(){
        return codigo;
    }

    public int getDuracao(){
        return duracao;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public void setDuracao(int duracao){
        this.duracao = duracao;
    }

    public String toString(){
        return "Título: "+titulo+'\n'+"Duração: "+duracao+'\n'+"Código: "+codigo+'\n';
    }
}
