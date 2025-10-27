public class Carro extends Veiculo{
    String modelo;
    int capacidadePortaMalas;

    public Carro(String modelo, int capacidadePortaMalas, String cor, int anoDeFabricacao, String placa, Motor motor){
        super(cor, anoDeFabricacao, placa, motor);
        this.modelo = modelo;
        this.capacidadePortaMalas = capacidadePortaMalas;
    }

    public void mostrarInformacoes(){
        System.out.println("Veículo: "+modelo);
        System.out.println("Cor: "+cor);
        System.out.println("Ano: "+anoDeFabricacao);
        System.out.println("Potência: "+motor.potencia+" cv");
        System.out.println("Combustível: "+motor.combustivel);
        System.out.println("Capacidade do Porta Malas: "+capacidadePortaMalas+" litros");
        System.out.println("Placa: "+placa);
    }
}