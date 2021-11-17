/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoconta;


public class Cliente {
    private String nome;
    private String cpf;
    
    //private String endereco;
    private Endereco endereco;

    public Cliente() {
    }

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    
    public Cliente(String nome, String cpf, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
     
    
    public String imprime(){
        return imprime(false);
    }
    
    public String imprime(boolean comEndereco){
        String resultado = "Nome: " + nome + "\nCPF: " + cpf;
        if(comEndereco){
            resultado = resultado.concat("\nEndereço: " + endereco.imprime());
        }
        return resultado;
    }
}
