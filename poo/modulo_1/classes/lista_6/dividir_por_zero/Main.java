package modulo_1.classes.lista_6.dividir_por_zero;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static int dividir(int numerador, int demoninador){
        return numerador/demoninador;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        do{
            try{
                System.out.println("Informe o Numerador");
                int numerador = scanner.nextInt();

                System.out.println("Informe o Denominador");
                int demoninador = scanner.nextInt();

                int r = dividir(numerador, demoninador);

                System.out.println("Resultado = "+r);

                continuar = false;
            }
            catch(ArithmeticException ae){// como a função catch entrou antes de printar o resultado
                System.out.println("O denominador não pode ser 0");
            }
            catch(InputMismatchException ime){
                System.out.println("Valor inválido, informe um número inteiro");
            }
        }while(continuar);
        
        scanner.close();
    }
}
