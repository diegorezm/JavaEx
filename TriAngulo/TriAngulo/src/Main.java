import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        Calc calc = new Calc();
        Float a = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira um lado do triângulo","TRI", JOptionPane.QUESTION_MESSAGE));
        Float b = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira outro lado do triângulo","TRI", JOptionPane.QUESTION_MESSAGE));
        Float c = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira mais um lado do triângulo","TRI", JOptionPane.QUESTION_MESSAGE));

        calc.setA(a);
        calc.setB(b);
        calc.setC(c);
        calc.tipoTriangulo(null,a,b,c);
        if (calc.ehTriangulo()){
            System.out.println("SIM");
            System.out.println(calc.getTipoTriangulo());
            System.out.println(calc.periMetro());

        }else{
            System.out.println("NÃO");
            System.exit(0);
        }
    }
}
