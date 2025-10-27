package modulo_1.classes.lista_3.as2;

public class ImovelCondominio extends Imovel{
    private String bloco;
    private int nrUnidade;

    public ImovelCondominio(int cep, String logradouro, int numero, String cidade, String uf, String tipo, String bloco, int nrUnidade){
        super(cep, logradouro, numero, cidade, uf, tipo);
        this.bloco = bloco;
        this.nrUnidade = nrUnidade;
    }
    
    
    public void mostrarInformações(){
        super.mostrarInformações();
        System.out.println("Número da Unidade: "+getNrUnidade());
        System.out.println("Bloco: "+getBloco());
        // System.out.println();
    }
    
    public String getBloco(){
        return bloco;
    }
    
    public int getNrUnidade(){
        return nrUnidade;
    }
    
    
    public void setCep(int cep){
        if(cep != 0)super.setCep(cep);
    }
    
    public void setLogradouro(String logradouro){
        if(!logradouro.equals("0"))super.setLogradouro(logradouro);
    }
    
    public void setNumero(int numero){
        if(numero != 0)super.setNumero(numero);
    }
    
    public void setCidade(String cidade){
        if(!cidade.equals("0"))super.setCidade(cidade);
    }
    
    public void setUf(String uf){
        if(!uf.equals("0"))super.setUf(uf);
    }
    
    public void setTipo(String tipo){
        if(!tipo.equals("0"))super.setTipo(tipo);
    }
    
    public void setBloco(String bloco){
        if(!bloco.equals("0"))this.bloco = bloco;
    }
    
    public void setNrUnidade(int nrUnidade){
        if(nrUnidade != 0)this.nrUnidade = nrUnidade;
    }
    
}
