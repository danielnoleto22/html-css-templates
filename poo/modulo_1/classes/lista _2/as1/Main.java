import java.util.Scanner;
import java.util.ArrayList;

/*
 *      Foi criado um menu de navegação:
 *          1 para cadastrar carro
 *          2 para cadastrar moto
 *          3 para cadastrar ônibus
 *          4 para mostrar a lista de todos os veículos cadastrados
 *          0 para encerrar o programa
 *      A criação de 2 exemplos de cada tipo de veículo está feita no arquivo chamado "teste, 
 *      sendo possível o usuário adicionar uma quantidade finita de veículos determinada pela capacidade de memória de seu dispositivo.
 *      Para utilizar os casos em "teste", basta selecionar tudo, copiar e colar no terminal.
 *      A classe pública Motor é agregação da classe pública Veículo
 *      As classes públicas Carro, Moto e Onibus herdaram todos os atributos e o método contrutor de Veiculo.      
 *
 */

public class Main{


    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        String cor, placa, combustivel, modelo, rota;
        int anoDeFabricacao, potencia, capacidadePortaMalas, cilindradas, quantidadePassageiros;
        int op = 1;
        Motor aux;
        ArrayList<Carro>carro = new ArrayList<>();
        ArrayList<Moto>moto = new ArrayList<>();
        ArrayList<Onibus>onibus = new ArrayList<>();
        

        while(op != 0){

            System.out.println("1 >> Cadastrar Carro");
            System.out.println("2 >> Cadastrar Moto");
            System.out.println("3 >> Cadastrar Ônibus");
            System.out.println("4 >> Mostrar todos os Veículos");
            System.out.println("0 >> Sair");
            op = scanner.nextInt();
            scanner.nextLine();

            switch(op){
                case 1:
                    System.out.println("Informe o modelo do Carro");
                    modelo = scanner.nextLine();
                    System.out.println("Informe a cor do Carro");
                    cor = scanner.nextLine();
                    System.out.println("Infome o ano de fabricação do Carro");
                    anoDeFabricacao = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Infome a potência do Carro");
                    potencia = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Informe o combustível do Carro");
                    combustivel = scanner.nextLine();
                    System.out.println("Informe a capacidade do portamalas do Carro");
                    capacidadePortaMalas = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Informe a placa do Carro");
                    placa = scanner.nextLine();

                    aux = new Motor(potencia, combustivel);
                    carro.add(new Carro(modelo, capacidadePortaMalas, cor, anoDeFabricacao, placa, aux));
                    break;

                case 2:
                    System.out.println("Informe o modelo da Moto");
                    modelo = scanner.nextLine();
                    System.out.println("Informe a cor da Moto");
                    cor = scanner.nextLine();
                    System.out.println("Informe o ano de fabricação da Moto");
                    anoDeFabricacao = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Informe as potência da Moto");
                    potencia = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Informe o combustível da Moto");
                    combustivel = scanner.nextLine();
                    System.out.println("Informe as cilindradas do Moto");
                    cilindradas = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Informe a placa da Moto");
                    placa = scanner.nextLine();

                    aux = new Motor(potencia, combustivel);
                    moto.add(new Moto(modelo, cilindradas, cor, anoDeFabricacao, placa, aux));
                    break;

                case 3: 
                    System.out.println("Informe a cor do Ônibus");
                    cor = scanner.nextLine();
                    System.out.println("Informe o ano de fabricação do Ônibus");
                    anoDeFabricacao = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Informe a potência do Ônibus");
                    potencia = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Informe o combustível do Ônibus");
                    combustivel = scanner.nextLine();
                    System.out.println("Informe a quantidade de passageiros do Ônibus");
                    quantidadePassageiros = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Informe a rota do Ônibus");
                    rota = scanner.nextLine();
                    System.out.println("Informe a placa do Ônibus");
                    placa = scanner.nextLine();

                    aux = new Motor(potencia, combustivel);
                    onibus.add(new Onibus(quantidadePassageiros, rota, cor, anoDeFabricacao, placa, aux));
                    break;

                case 4:
                    System.out.println();
                    for(Carro i : carro){
                        i.mostrarInformacoes();
                        i.andar();
                    }
                    for(Moto i : moto){
                        i.mostrarInformacoes();
                        i.andar();
                    }
                    for(Onibus i : onibus){
                        i.mostrarInformacoes();
                        i.andar();
                    }
            }

        }

        scanner.close();
    }
}