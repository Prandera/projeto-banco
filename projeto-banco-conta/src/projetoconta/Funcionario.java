/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoconta;

/*
* A Herança é um recurso da programação orientada a objetos que permite o 
* reaproveitamento de códigos já implementados. Então, a partir de uma classe 
* base (chamada de super classe - "classe pai") é possível dar origem a uma 
* classe especializada (chamada de subclasse - "classe filha"), com tudo o que 
* já estiver implementado, sendo aplicável a nova classe.
* Dado o exemplo das classes Pessoa e Funcionario. A classe Pessoa representa 
* a super classe e Funcionario representa a Subclasse.
* No Java usamos o identificador "extends" para designar a herança.
* O identificador "this" representa a própria classe enquanto o identificador
* "super" representa a super classe.
* Existe na teoria de orientação a objetos o conceito de herança múltipla, porém
* o Java nâo faz esta implementação (O C++ permite o uso de herança múltipla). 
* O Java define a classe Object como classe base para TODAS as classes implementadas
* em Java.
*/

public class Funcionario extends Pessoa{
    private String ctps;

    public Funcionario() {
    }

    public Funcionario(String ctps) {
        this.ctps = ctps;
    }

    public Funcionario(String ctps, String nome, String cpf, Endereco endereco) {
        super(nome, cpf, endereco);
        this.ctps = ctps;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }
    
    
}
