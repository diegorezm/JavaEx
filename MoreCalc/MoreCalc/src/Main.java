// Escreva um aplicativo para ler três inteiros digitados pelo usuário e exibir a soma, a média e 
// o produto desses números
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();
        int prim = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Primeiro número:","MORECALC", JOptionPane.QUESTION_MESSAGE));
        int sec = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Segundo número:","MORECALC", JOptionPane.QUESTION_MESSAGE));
        int tre = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Terceiro número:","MORECALC", JOptionPane.QUESTION_MESSAGE));

        calc.setPrim(prim);
        calc.setSec(sec);
        calc.setTre(tre);

        JOptionPane.showMessageDialog(null, "A soma entre esses números é:"+calc.getSoma()+"\nA média é:"+calc.getMedia()+"\nO produto é:"+calc.getProd(),"MORECALC" ,JOptionPane.INFORMATION_MESSAGE);

    }
}
