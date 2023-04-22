import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog(null,"Diga uma frase:","UPPERCASE",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Frase em caixa alta:\n"+a.toUpperCase(), "UPPERCASE", JOptionPane.INFORMATION_MESSAGE);
    }
}
