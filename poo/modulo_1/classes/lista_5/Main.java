package modulo_1.classes.lista_5;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        
        Cliente cliente_1, cliente_2;
        Conta conta_1, conta_2;

        cliente_1 = new Cliente("Daniel Noleto", "12345678901");
        cliente_2 = new Cliente("Fulana", "12345678900");

        conta_1 = new ContaPoupanca(1, cliente_1, 0, 0.28);
        conta_2 = new ContaCorrente(2, cliente_2, 0, 8000.00);

        System.out.println(conta_1.toString());
        System.out.println(conta_2.toString());

        if(conta_1.validarConta())System.out.println("Conta: "+conta_1.numero+" é válida.");
        else System.out.println("Conta: "+conta_1.numero+" é inválida.");//conta inválida

        if(conta_2.validarConta())System.out.println("Conta: "+conta_2.numero+" é válida.");
        else System.out.println("Conta: "+conta_2.numero+" é inválida.\n");//conta inválida

        conta_1.depositar(500.00);//saldo R$500.00
        conta_2.depositar(25000.00);//saldo R$25000.00

        if(conta_1.validarConta())System.out.println("Conta: "+conta_1.numero+" é válida.");
        else System.out.println("Conta: "+conta_1.numero+" é inválida.");//conta válida
        
        if(conta_2.validarConta())System.out.println("Conta: "+conta_2.numero+" é válida.");
        else System.out.println("Conta: "+conta_2.numero+" é inválida.\n");//conta válida
        
        System.out.println(conta_1.toString());
        System.out.println(conta_2.toString());

        conta_2.transferir(100, conta_1);//transferir com sucesso conta_1.saldo = R$600,00 conta_2.saldo = R$24900,00
        conta_1.transferir(1000, conta_2);//saldo insuficiente

        System.out.println(conta_1.toString());
        System.out.println(conta_2.toString());

        conta_1.sacar(100);//sacar com sucesso conta_1.saldo = R$500,00
        conta_2.sacar(50000);//saldo insuficiente conta_2.saldo = R$24900,00

        System.out.println(conta_1.toString());
        System.out.println(conta_2.toString());

        scanner.close();

    }
}
