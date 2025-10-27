public class Onibus extends Veiculo{
    public int quantidadePassageiros;
    public String rota;

    public Onibus(int quantidadePassageiros, String rota, String cor, int anoDeFabricacao, String placa, Motor motor){
        super(cor, anoDeFabricacao, placa, motor);
        this.quantidadePassageiros = quantidadePassageiros;
        this.rota = rota;
    }

    public void mostrarInformacoes(){
        System.out.println("Cor: "+cor);
        System.out.println("Ano: "+anoDeFabricacao);
        System.out.println("Potência: "+motor.potencia+" cv");
        System.out.println("Combustível: "+motor.combustivel);
        System.out.println("Quantidade de Passageiros: "+quantidadePassageiros);
        System.out.println("Rota: "+rota);
        System.out.println("Placa: "+placa);
    }
}