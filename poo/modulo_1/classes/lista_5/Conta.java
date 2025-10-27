package modulo_1.classes.lista_5;

public abstract class Conta {
    protected int numero;
    protected Cliente titular;
    protected double saldo;
    

    public Conta(int numero, Cliente titular, double saldo){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void sacar(double valor){


        if(this.getClass().getSimpleName() == "ContaPoupanca"){}
            if(saldo >= valor)
                this.saldo -= valor;
            else System.out.println("Saldo Insuficiente");
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void transferir(double valor, Conta destino){
        if(saldo >= valor){
            saldo -= valor;
            destino.saldo += valor;
            System.out.println("Valor Transferido");
        }
        else{
            System.out.println("Saldo Insuficiente");
        }
    }

    public abstract boolean validarConta();

    public String toString(){
        return "Conta Nº: "+numero+"\n"+titular.toString()+"\nSaldo: "+saldo;
    }
}
