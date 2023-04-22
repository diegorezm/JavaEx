import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
    Nomes objNomes = new Nomes();

    objNomes.setPrimeiroNome(JOptionPane.showInputDialog(null,"Primeiro nome","Nome Completo",JOptionPane.QUESTION_MESSAGE));

    objNomes.setSegundoNome(JOptionPane.showInputDialog(null,"Segundo nome","Nome Completo",JOptionPane.QUESTION_MESSAGE));

    JOptionPane.showMessageDialog(null,"Seu nome é:"+objNomes.NomeCompleto(),"Nome Completo",JOptionPane.INFORMATION_MESSAGE);
    System.exit(0);
}
}
