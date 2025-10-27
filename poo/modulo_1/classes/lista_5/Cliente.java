package modulo_1.classes.lista_5;

public class Cliente {
    private String nome;
    private String cpf;

    public Cliente (String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String toString(){
        return "Nome: "+nome+"\nCPF: "+cpf;
    }
}
