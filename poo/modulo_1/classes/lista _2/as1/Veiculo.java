public class Veiculo{
    public String cor;
    public int anoDeFabricacao;
    public String placa;
    public Motor motor; //agregação

    public Veiculo(String cor, int anoDeFabricacao, String placa, Motor motor){
        this.cor = cor;
        this.anoDeFabricacao = anoDeFabricacao;
        this.placa = placa;
        this.motor = motor; //recebe o motor do construtor da classe Motor
    }

    public void andar(){
        System.out.println("O veículo está em movimento");
        System.out.println();
    }
}