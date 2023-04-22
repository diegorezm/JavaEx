import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Diga um número:","RAIZ QUAD",JOptionPane.QUESTION_MESSAGE));
        calc.setNum(num);

        JOptionPane.showMessageDialog(null, "A raiz deste número é:"+calc.getRaiz(), "RAIZ QUALC", JOptionPane.INFORMATION_MESSAGE);
    }
}
