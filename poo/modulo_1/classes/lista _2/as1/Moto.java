public class Moto extends Veiculo{
    String modelo;
    int cilindradas;

    public Moto(String modelo, int cilindradas, String cor, int anoDeFabricacao, String placa, Motor motor){
        super(cor, anoDeFabricacao, placa, motor);
        this.modelo = modelo;
        this.cilindradas = cilindradas;
    }

    public void mostrarInformacoes(){
        System.out.println("Veículo: "+modelo);
        System.out.println("Cor: "+cor);
        System.out.println("Ano: "+anoDeFabricacao);
        System.out.println("Potência: "+motor.potencia+" cv");
        System.out.println("Combustível: "+motor.combustivel);
        System.out.println("Cilindradas "+cilindradas+" cc");
        System.out.println("Placa: "+placa);
    }
}