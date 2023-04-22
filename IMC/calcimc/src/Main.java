import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();

        Double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Diga sua altura:", "IMC", JOptionPane.QUESTION_MESSAGE));
        Double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Diga seu peso:", "IMC", JOptionPane.QUESTION_MESSAGE));

        calc.setAltura(altura);
        calc.setPeso(peso);

        JOptionPane.showMessageDialog(null, "Seu peso é:"+calc.getPeso()+"\nSua altura é:"+calc.getAltura()+"\nSeu IMC é:"+calc.calcIMC(), "IMC",JOptionPane.INFORMATION_MESSAGE);

    }
}
