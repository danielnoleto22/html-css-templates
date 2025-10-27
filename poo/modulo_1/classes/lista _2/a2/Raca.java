public class Raca{
    
        public String descricao;
        public int expectativaDeVida;
        public String porte;


        public Raca(String descricao, int expectativaDeVida, String porte){
            this.descricao = descricao;
            this.expectativaDeVida = expectativaDeVida;
            this.porte = porte;
        }
        
        public void mostrarInformacoes(){
            System.out.println("Descrição: "+descricao);
            System.out.println("Expectativa de vida: "+expectativaDeVida+"anos");
            System.out.println("Porte: "+porte);
        }
}