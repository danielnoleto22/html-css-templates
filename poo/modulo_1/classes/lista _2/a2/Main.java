import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        int idade;
        String nome;
		
		Raca poodle = new Raca("Poodle", 18, "Pequeno");
        poodle.mostrarInformacoes();
        
		System.out.println("Informe o nome do cachorro");
		nome = scanner.nextLine();
        
		System.out.println("Infome a idade do cachorro");
        idade = scanner.nextInt();
        
		Cachorro cachorro = new Cachorro(nome, idade, poodle);

		cachorro.calcTempoDeVida();
	
	}
}