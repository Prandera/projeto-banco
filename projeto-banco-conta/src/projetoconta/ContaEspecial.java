/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoconta;

public class ContaEspecial extends Conta{
    private double limite;

    public ContaEspecial() {
    }

    public ContaEspecial(double limite) {
        this.limite = limite;
    }

    public ContaEspecial(double limite, double saldo) {
        super(saldo);
        this.limite = limite;
    }

    public ContaEspecial(double limite, double saldo, String cliente) {
        super(saldo, cliente);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    /*
    * A sobrescrita de método é o recurso da orientação a objetos que permite
    * que um método definido na super classe seja reescrito na subclasse, fazendo 
    * com que a subclasse tenha um comportamento diferenciado (específico) quando
    * tiver sido feita a chamada para este método.
    * Podemos fazer a sobrescrita escrevendo o cabeçalho do método de maneira 
    * identica ao que está definido na super classe (tipo de retorno, identificador e
    * parâmetros de entrada). A sobrescrita pode permitir a alteração completa do 
    * método definido na super classe, como também pode apenas incrementar sua
    * execução (neste caso, iremos fazer a chamada do método a partir do 
    * identificador "super").
    */
    
    @Override
    public boolean sacar(double valor) {
       if(valor > saldo + limite){
           return false;
       }
       saldo = saldo - valor;
       return true;
    }

    @Override
    public String imprimirSaldo() {
        return super.imprimirSaldo() + "\nLimite = " + limite; 
    }
    
    
    
    
    
    
}
