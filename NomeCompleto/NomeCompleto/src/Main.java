//Elabore um aplicativo para armazenar o nomee osobrenome de uma pessoa. 
//Implemente um método para permitir que seja exibido o nome completo da pessoa.

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
    Nomes objNomes = new Nomes();

    objNomes.setPrimeiroNome(JOptionPane.showInputDialog(null,"Primeiro nome","Nome Completo",JOptionPane.QUESTION_MESSAGE));

    objNomes.setSegundoNome(JOptionPane.showInputDialog(null,"Segundo nome","Nome Completo",JOptionPane.QUESTION_MESSAGE));

    JOptionPane.showMessageDialog(null,"Seu nome é:"+objNomes.NomeCompleto(),"Nome Completo",JOptionPane.INFORMATION_MESSAGE);
    System.exit(0);
}
}
