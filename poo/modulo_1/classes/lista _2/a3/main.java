import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

/*
*   Foi adicionado um menu para navegação para cadastro de tipo:
*   Foi criada uma lista dinâmica da biblioteca ArrayList do tipo pesso física ou jurídica para armazenar dados de pessoas inseridos
*   Foi adicionado uma função que gera um cpf dado o nome e o tipo sanguíneo de uma pessoa.
*   Foi adicionado uma função que gera um cnpj dado nome, endereço e o ramo de atuação de um pessoa/empresa.
*      1: para cadastrar uma pessoa física
*           *   Fornecer nome e sobrenome
*          *   Fornecer endereço
*          *   Fornecer tipo sanguíneo
*          +   É gerado o CPF
*      2: para cadastrar uma pessoa jurídica
*          *   Fornecer nome e sobrenome
*          *   Fornecer endereço
*          *   Fornecer ramo de atuação
*          +   É gerado o CNPJ
*      0: para saír
*          +   É exibido todos as pessoas, física ou jurídicas cadastradas

*   Caso de teste:

*/


public class main{

    public static long gerarCpf(){
        Random rand = new Random();
        long cpf = 10000000000L + (Math.abs(rand.nextLong()) % 90000000000L);
        return cpf;
    }
    
    public static long gerarCnpj(){
        Random rand = new Random();
        long cnpj = 10000000000000L + (Math.abs(rand.nextLong()) % 90000000000000L);

        return cnpj;
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
    
        String nome, endereco, tiposanguineo, ramodeatuacao;
        int op = 3;
        long cpf, cnpj;
        ArrayList<PessoaFisica>pessoafisica = new ArrayList<>();
        ArrayList<PessoaJuridica>pessoajuridica = new ArrayList<>();
        
        while(op != 0){
            
            System.out.println("1 >> Cadastrar uma Pessoa Física");
            System.out.println("2 >> Cadastrar uma Pessoa Jurídica");
            System.out.println("0 >> Sair");
            op = scanner.nextInt();
            scanner.nextLine();

            switch(op){
                case 1:
                    System.out.println("Informe nome e sobrenome");
                    nome = scanner.nextLine();
                    System.out.println("Informe o endereço");
                    endereco = scanner.nextLine();
                    System.out.println("Informe o tipo sanguíneo");
                    tiposanguineo = scanner.nextLine();
                    cpf = gerarCpf();
                    pessoafisica.add(new PessoaFisica(nome, endereco, tiposanguineo, cpf));
                break;
    
                case 2:
                    System.out.println("Informe nome e sobrenome");
                    nome = scanner.nextLine();
                    System.out.println("Informe o endereço");
                    endereco = scanner.nextLine();
                    System.out.println("Informe o ramo de atuação");
                    ramodeatuacao = scanner.nextLine();
                    cnpj = gerarCnpj();
                    pessoajuridica.add(new PessoaJuridica(nome, endereco, ramodeatuacao, String.valueOf(cnpj)));
                break;
    
                default:
                break;
            }
    
        }
        for(PessoaFisica i : pessoafisica){
            i.mostrarInformacoes();
        }
    
        for(PessoaJuridica i : pessoajuridica){
            i.mostrarInformacoes();
        }

        scanner.close();
    }
    
}