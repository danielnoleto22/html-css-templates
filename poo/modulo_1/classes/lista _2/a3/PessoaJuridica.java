public class PessoaJuridica{
    public String ramodeatuacao;
    public String cnpj;
    public Pessoa pessoa;

    public PessoaJuridica(String nome, String endereco, String ramodeatuacao, String cnpj){
        this.ramodeatuacao = ramodeatuacao;
        this.cnpj = cnpj;
        this.pessoa = new Pessoa();
        this.pessoa.nome = nome;
        this.pessoa.endereco = endereco;
    }

    public void mostrarInformacoes(){
        System.out.println("Nome: "+pessoa.nome);
        System.out.println("Endereço: "+pessoa.endereco);
        System.out.println("Ramo de atuação: "+ramodeatuacao);
        System.out.println("CNPJ: "+cnpj);
    }
}