package modulo_1.classes.lista_5;

public class ContaCorrente extends Conta implements Tributavel{
    private double limite;

    public ContaCorrente (int numero, Cliente titular, double saldo, double limite){
        super(numero, titular, saldo);
        this.limite = limite;
    }
    
    public double calculaTributos(){
        double tributos = 0.05;

        if(saldo < 0)return Math.abs(saldo * tributos);
        else return 0;
    }

    public boolean validarConta(){
        return saldo > 0;
    }

    public String toString(){
        return super.toString()+"\nLimite: "+limite+"\n";
    }

    public double getLimite(){
        return limite;
    }
}
