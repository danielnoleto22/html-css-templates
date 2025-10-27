public class Cachorro{
    
    public String nome;
    public int idade;
    public Raca raca;
    
    public Cachorro(String nome, int idade, Raca raca){
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }
    
    public void calcTempoDeVida(){
        if(idade < raca.expectativaDeVida){
            System.out.println(nome+" tem uma expectativa de vida de mais "+(raca.expectativaDeVida-idade)+" anos");
        }
        else if(idade > raca.expectativaDeVida){
            System.out.println(nome+" tem "+(idade - raca.expectativaDeVida)+" anos a mais do que a expectativa de vida de sua raça");
        }
        else{
            System.out.println(nome+" tem a mesma idade que a expectativa de vida da raça dele");
        }
    }
}