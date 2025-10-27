package modulo_1.classes.lista_4.a1;

public class Midia {
    private int codigo;
    private String titulo;
    private int anoLancamento;

    public Midia (int codigo, String titulo, int anoLancamento){
        this.codigo = codigo;
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public int getanoLancamento(){
        return this.anoLancamento;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setanoLancamento(int anoLancamento){
        this.anoLancamento = anoLancamento;
    }

    public String toString(){
        return "Título: "+titulo+"\nCódigo: "+codigo+
        "\nAno de Lançamento: "+anoLancamento+'\n';
    }
}
