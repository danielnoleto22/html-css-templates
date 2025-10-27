package modulo_1.classes.lista_6.cadastro_de_pessoa;

public class Pessoa {
    public String nome;
    public int idade;
    public String cpf;
    public String endereco;
    public String email;

    public Pessoa(String nome, int idade, String cpf, String endereco, String email){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
    }

    public String toString(){
        return "Nome: "+nome+"\nIdade: "+idade+"\nCPF: "+cpf+"\nEndereço: "+endereco+"\nEmail: "+email;
    }
}
