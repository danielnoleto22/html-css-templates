package modulo_1.classes.lista_6.cadastro_de_pessoa;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    
        Scanner scanner = new Scanner(System.in);

        String nome, cpf, endereco, email;
        int idade;
        CadastroPessoa cadastro = new CadastroPessoa();

            
        try{
            System.out.println("Informe o Nome");
            nome = scanner.nextLine();
            System.out.println("Informe a Idade");
            idade = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Informe o CPF");
            cpf = scanner.nextLine();
            System.out.println("Infome o Endereço");
            endereco = scanner.nextLine();
            System.out.println("Infome o Email");
            email = scanner.nextLine();

            Pessoa pessoa_1 = cadastro.cadastrar(nome, idade, cpf, endereco, email);
            System.out.println("Cadastro Realizado com Sucesso!");
            System.out.println(pessoa_1.toString());
        }
        catch (PessoaRunTimeException e ){
            System.out.println("Erro ao Cadastrar Pessoa "+e.getMessage());
        }
        scanner.close();   
    }
}
