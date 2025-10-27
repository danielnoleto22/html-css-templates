package modulo_1.classes.lista_5;

public class ContaPoupanca extends Conta{
    private double juros;
    
    public ContaPoupanca(int numero, Cliente titular, double saldo, double juros){
        super(numero, titular, saldo);
        this.juros = juros;
    }

    public boolean validarConta(){
        return saldo > 0;
    }

    public String toString(){
        return super.toString()+"\nJuros: "+juros+"\n";
    }
}
