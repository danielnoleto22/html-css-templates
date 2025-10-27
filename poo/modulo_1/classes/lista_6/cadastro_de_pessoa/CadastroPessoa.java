package modulo_1.classes.lista_6.cadastro_de_pessoa;

public class CadastroPessoa {
    public Pessoa cadastrar(String nome, int idade, String cpf, String endereco, String email){
        if(nome == null || nome.isBlank()){
            throw new PessoaRunTimeException("Nome não pode ser vazio");
        }
        if(idade <= 0 || idade > 150){
            throw new PessoaRunTimeException("Idade inválida");
        }
        if(cpf.length() != 11){
            throw new PessoaRunTimeException("CPF inválido");
        }
        if(endereco == null || endereco.isBlank()){
            throw new PessoaRunTimeException("Endereço não pode ser vazio");
        }
        if(email == null || !email.contains("@")){
            throw new PessoaRunTimeException("Email Inválido.");
        }
        return new Pessoa(nome, idade, cpf, endereco, email);
    }
}
