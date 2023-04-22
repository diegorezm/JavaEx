import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        var calc = new Calc();
        Byte a = Byte.parseByte(JOptionPane.showInputDialog(null, "Insira um número", "TABUADA",3));
        calc.setNum(a);
        JOptionPane.showMessageDialog(null, calc.tabuada(), "Tabuada do"+" "+calc.getNum(), 3);
    }
}
