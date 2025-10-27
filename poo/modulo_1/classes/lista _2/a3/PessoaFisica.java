public class PessoaFisica{
    public String tiposanguineo;
    public long cpf;
    public Pessoa pessoa;

    public PessoaFisica(String nome, String endereco, String tiposanguineo, long cpf){
        this.tiposanguineo = tiposanguineo;
        this.cpf = cpf;
        this.pessoa = new Pessoa();
        this.pessoa.nome = nome;
        this.pessoa.endereco = endereco;
    }

    public void mostrarInformacoes(){
        System.out.println("Nome: "+pessoa.nome);
        System.out.println("Endereço: "+pessoa.endereco);
        System.out.println("Tipo Sanguíneo: "+tiposanguineo);
        System.out.println("CPF: "+cpf);
    }
}