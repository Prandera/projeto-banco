/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoconta;

public class Conta {
    //private String cliente;
    private Cliente cliente;
    protected double saldo;
    
    /**
     * O método construtor é o método usado para instanciar os objetos e inicializá-los.
     * Sua chamada está vinculada ao uso do "new".
     * O método construtor no Java terá exatamente o mesmo nome da Classe.
     * O método construtor não tem um tipo de retorno específico (nem void) e sempre
     * irá retornar (de maneira implícita) um objeto da classe (sem que seja 
     * utilizado o comando "return")
     * 
     */   
    public Conta(double saldo){
        this.saldo = saldo;
    }
    
    public Conta(){
        //this(0.0);
        this.saldo = 0.0;
    }
    
    public Conta(double saldo, String cliente){
        this(saldo);
        //this.saldo = saldo;        
        this.cliente = new Cliente();
        this.cliente.setNome(cliente);
    }
    
    //Métodos "get" e "set"
    /* Os métodos "get" e "set" são métodos padrão do Java para recuperação e 
    * alteração dos valores dos atributos
    */
    /*
    public String getCliente(){
        return cliente;
    }
    
    public void setCliente(String cliente){
        this.cliente = cliente;
    }*/
    //Novo get e set Cliente

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    
    public double getSaldo(){
        return saldo;
    }
    
    /*
    * A criação de métodos no Java, segue o mesmo padrão de definição do "C", onde
    * necessário especificar três informações básicas:
    * 1- Qual o tipo de retorno (ou "void" caso não tenha retorno);
    * 2- Definição do identificador (nome) do método;
    * 3- Definição dos parâmetros de entrada do método.
    */
    public void depositar(double valor){
        saldo = saldo + valor;
    }
    
    public boolean sacar(double valor){
        if(valor > saldo){
            return false;
        }
        saldo = saldo - valor;
        return true;
    }
    
    /*
    * Sobrecarga de Métodos
    *
    * A sobrecarga de métodos permite criar dois ou mais métodos em uma
    * mesma classe com identificadores, retorno e funcionalidade iguais,
    * porém com parâmetros de entrada distintos.
    * O que diferencia um método sobrecarregado de outro é a quantidade
    * e sequencia do tipo do parâmetro de entrada.
    */
    public String imprimirSaldo(){
        return "Saldo = " + saldo;
    }
    
    public String imprimirSaldo(boolean comCliente){
        if(comCliente){
            return cliente.imprime() + "\n" + imprimirSaldo();
        }
        return imprimirSaldo();
    }
    
    public String imprimirSaldo(String observacao){
        return imprimirSaldo() + "\n" + observacao;
    }
}
