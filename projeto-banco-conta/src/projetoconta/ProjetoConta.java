/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoconta;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ProjetoConta {

    public ProjetoConta(String inicio) {

    }

    public ProjetoConta() {
    }

    public static void main(String[] args) {
        ProjetoConta projeto = new ProjetoConta();
        Conta conta = new ContaEspecial(1000);
        String[] menu = {"Imprimir Saldo", "Depositar", "Sacar", "Imprimir Endereço", "Sair"};
        String opcao;
        
        Pessoa pessoa = new Pessoa();
        pessoa.toString();
        Funcionario funcionario = new Funcionario();
        funcionario.andar();


        Cliente cliente = new Cliente();
        cliente.setNome(JOptionPane.showInputDialog("Entre com o nome do Cliente:"));
        cliente.setCpf(JOptionPane.showInputDialog("Entre com o CPF do Cliente:"));

        Endereco endereco = new Endereco();
        endereco.setRua(JOptionPane.showInputDialog("Entre com a Rua do Cliente:"));
        endereco.setNumero(JOptionPane.showInputDialog("Entre com o número do Endereço do Cliente:"));
        endereco.setCep(JOptionPane.showInputDialog("Entre com o CEP do Endereço do Cliente:"));
        cliente.setEndereco(endereco);

        conta.setCliente(cliente);

        do {
            opcao = (String) JOptionPane.showInputDialog(null,
                    "Escolha uma opção:", "Menu", JOptionPane.QUESTION_MESSAGE,
                    null, menu, menu[0]);
            switch (opcao) {
                case "Depositar":
                    conta.depositar(Double.parseDouble(
                            JOptionPane.showInputDialog("Entre com o valor de depósito:")));
                case "Imprimir Saldo":
                    JOptionPane.showMessageDialog(null, conta.imprimirSaldo(true));
                    break;
                case "Sacar":
                    if (!conta.sacar(Double.parseDouble(JOptionPane.
                            showInputDialog("Entre com o valor do saque:")))) {
                        JOptionPane.showMessageDialog(null, "Saldo insuficiente!!!\n\n"
                                + "Não é possível efetuar o saque!!!",
                                "Atenção!", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "Imprimir Endereço":
                    JOptionPane.showMessageDialog(null, cliente.imprime(true));
                    break;
                case "Sair":
                    JOptionPane.showMessageDialog(null, "Bye!!!");
                    break;
            }
        } while (!opcao.equals("Sair"));
    }
}
