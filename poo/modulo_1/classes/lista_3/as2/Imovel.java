package modulo_1.classes.lista_3.as2;

public class Imovel {
    private int cep;
    private String logradouro;
    private int numero;
    private String cidade;
    private String uf;
    private String tipo;

    public Imovel(int cep, String logradouro, int numero, String cidade, String uf, String tipo){
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
        this.uf = uf;
        this.tipo = tipo;
    }

    public int getCep(){
        return cep;
    }

    public String getLogradouro(){
        return logradouro;
    }

    public int getNumero(){
        return numero;
    }

    public String getCidade(){
        return cidade;
    }

    public String getUf(){
        return uf;
    }

    public String getTipo(){
        return tipo;
    }

    public void mostrarInformações(){
        System.out.println("As informações do Imóvel são:");
        System.out.println("Logradouro: "+this.getLogradouro());
        System.out.println("Número: "+this.getNumero());
        System.out.println("CEP: "+this.getCep());
        System.out.println("Cidade: "+this.getCidade());
        System.out.println("Unidade Federal: "+this.getUf());
        System.out.println("Tipo: "+this.getTipo());
        // System.out.println();
    }
    

    public void setCep(int cep){
        if(cep != 0)this.cep = cep;
    }

    public void setLogradouro(String logradouro){
        if(!logradouro.equals("0"))this.logradouro = logradouro;
    }

    public void setNumero(int numero){
        if(numero != 0)this.numero = numero;
    }

    public void setCidade(String cidade){
        if(!cidade.equals("0"))this.cidade = cidade;
    }

    public void setUf(String uf){
        if(!uf.equals("0"))this.uf = uf;
    }

    public void setTipo(String tipo){
        if(!tipo.equals("0"))this.tipo = tipo;
    }

}
