package modulo_1.classes.lista_3.as2;
import java.util.Scanner;
import java.util.ArrayList;
//import java.util.IllformedLocaleException;
/*
*   Foi adicionado um menu de navegação para cadastro de imóveis de tipo:
*       1: para cadastrar Imovéis Residenciais. Em ordem, fornecer:
*           CEP
*           Logradouro
*           Número
*           Cidade
*           UF
*           Tipo de Imóvel
*       2: para cadastrar imóvel do tipo de Condomínio. Em ordem, fornecer:
*            CEP
*           Logradouro
*           Número
*           Cidade
*           UF
*           Tipo de Imóvel
*           Bloco
*           Número da Unidade
*           Foi adicionado um ArrayList para armazenar todos os Imóveis Residenciais adicionados em tempo de execução.
*           Foi adicionado um ArrayList para armazenar todos os Imóveis de Condomínio adicionados em tempo de execução.
*           Foi anexado um arquivo com dois exemplos de criação de cada tipo de imóvel utilizando todas as funções criadas. Copiar e colar no terminal.
*           A ativação da função "mostrarInformações()" de cada classe ficará por conta do usuário.
*               Botão 3 do menu        
*  
*/
public class Main {
    
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int cep, numero, nrUnidade, op = 1;
        String logradouro, cidade, uf, tipo, bloco;
        ArrayList<ImovelCondominio>imovelcondominio = new ArrayList<>();
        ArrayList<Imovel>imovel = new ArrayList<>();
        while(op != 0){
            System.out.println("1 >> Para adicionar um Imovel Residencial");
            System.out.println("2 >> Para Adicionar um Imovel de Condomínio");
            System.out.println("3 >> Para Listar Todos Imóveis");
            System.out.println("4 >> Para Alterar os Dados de Algum Imóvel");
            System.out.println("0 >> Sair");
            op = scanner.nextInt();
            scanner.nextLine();
            switch(op){
                case 1: 
                    System.out.println("Informe o CEP (somente números)");
                    cep = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Informe o Logradouro");
                    logradouro = scanner.nextLine();
                    System.out.println("Informe o Número");
                    numero = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Informe a Cidade");
                    cidade = scanner.nextLine();
                    System.out.println("Informe a UF");
                    uf = scanner.nextLine();
                    System.out.println("Informe o Tipo de Residência");
                    tipo = scanner.nextLine();
                    imovel.add(new Imovel(cep, logradouro, numero, cidade, uf, tipo));
                    break;
                case 2:
                    System.out.println("Informe o CEP (somente números)");
                    cep = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Informe o Logradouro");
                    logradouro = scanner.nextLine();
                    System.out.println("Informe o Número");
                    numero = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Informe a Cidade");
                    cidade = scanner.nextLine();
                    System.out.println("Informe a UF");
                    uf = scanner.nextLine();
                    System.out.println("Informe o Tipo de Residência");
                    tipo = scanner.nextLine();
                    System.out.println("Informe o bloco");
                    bloco = scanner.nextLine();
                    System.out.println("Informe o Número da Unidade");
                    nrUnidade = scanner.nextInt();
                    scanner.nextLine();
                    imovelcondominio.add(new ImovelCondominio(cep, logradouro, numero, cidade, uf, tipo, bloco, nrUnidade));
                    break;
                case 3:
                    System.out.println();
                    for(ImovelCondominio i : imovelcondominio){
                        i.mostrarInformações();
                        System.out.println();
                    }
                    
                    for(Imovel i : imovel){
                        i.mostrarInformações();
                        System.out.println();
                    }
                    break;
                    
                case 4:
                    System.out.println("Selecione um Imóvel da Lista:\n");
                    int counter = 1, id = 1;
                    for(Imovel i : imovel){
                        System.out.println("-- "+counter+++" --");
                        i.mostrarInformações();
                        System.out.println();
                    }
                
                    for(ImovelCondominio i : imovelcondominio){
                        System.out.println("-- "+counter+++" --");
                        i.mostrarInformações();
                        System.out.println();
                    }

                    id = scanner.nextInt();
                    scanner.nextLine();
                    counter = 1;

                    for(Imovel i : imovel){
                        
                        if(counter == id){
                            System.out.println("Digite o Novo CEP ou '0' para Pular");
                            i.setCep(scanner.nextInt());
                            scanner.nextLine();
                            System.out.println("Digite o Novo Logradouro ou '0' para Pular");
                            i.setLogradouro(scanner.nextLine());
                            System.out.println("Digite o Novo Número ou '0' para Pular");
                            i.setNumero(scanner.nextInt());
                            scanner.nextLine();
                            System.out.println("Digite a Nova Cidade  ou '0' para Pular");
                            i.setCidade(scanner.nextLine());
                            System.out.println("Digite a Nova Unidade Federal ou '0' para Pular");
                            i.setUf(scanner.nextLine());
                            System.out.println("Digite o Novo Tipo ou '0' para Pular");
                            i.setTipo(scanner.nextLine());
                            id = -1;
                        }
                        else if(id == -1)break;
                        counter++;
                    }
                
                    for(ImovelCondominio i : imovelcondominio){

                        if(counter == id){
                            System.out.println("Digite o Novo CEP ou '0' para Pular");
                            i.setCep(scanner.nextInt());
                            scanner.nextLine();
                            System.out.println("Digite o Novo Logradouro ou '0' para Pular");
                            i.setLogradouro(scanner.nextLine());
                            System.out.println("Digite o Novo Número ou '0' para Pular");
                            i.setNumero(scanner.nextInt());
                            scanner.nextLine();
                            System.out.println("Digite a Nova Cidade  ou '0' para Pular");
                            i.setCidade(scanner.nextLine());
                            System.out.println("Digite a Nova Unidade Federal ou '0' para Pular");
                            i.setUf(scanner.nextLine());
                            System.out.println("Digite o Novo Tipo ou '0' para Pular");
                            i.setTipo(scanner.nextLine());
                            System.out.println("Digite o Novo Bloco ou '0' para Pular");
                            i.setBloco(scanner.nextLine());
                            System.out.println("Digite o Novo Número de Unidade ou '0' para Pular");
                            i.setNrUnidade(scanner.nextInt());
                            id = -1;
                        }
                        else if(id == -1)break;
                        counter++;
                    }
                    break;
                default: 
                    break;
            }
        }
        scanner.close();
    }
}