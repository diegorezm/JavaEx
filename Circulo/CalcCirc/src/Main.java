import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc(); 

        String opracoes[]={"Diametro","Perimetro","Area"};
        String input =(String) JOptionPane.showInputDialog(null, "Escolha uma opção:", "CIRCULO",JOptionPane.QUESTION_MESSAGE,null, opracoes, opracoes[2]);

        if (input == "Perimetro"){
                Float raio =Float.parseFloat(JOptionPane.showInputDialog(null, "Diga o valor do raio:", "Circulo",JOptionPane.QUESTION_MESSAGE));
                calc.setRaio(raio);
                JOptionPane.showMessageDialog(null, "O Perimetro é:"+calc.calcPerim(), "CIRCULO", JOptionPane.INFORMATION_MESSAGE);
            
        }else if (input == "Diametro"){
                Float raio = Float.parseFloat(JOptionPane.showInputDialog(null, "Diga o valor do raio:", "Circulo",JOptionPane.QUESTION_MESSAGE));
                calc.setRaio(raio);
                JOptionPane.showMessageDialog(null, "O Diâmetro é:"+calc.calcDiam(), "CIRCULO", JOptionPane.INFORMATION_MESSAGE);
        }else if (input == "Area"){
                Float raio = Float.parseFloat(JOptionPane.showInputDialog(null, "Diga o valor do raio:", "Circulo",JOptionPane.QUESTION_MESSAGE));
                calc.setRaio(raio);
                JOptionPane.showMessageDialog(null, "A área é:"+calc.calcArea(), "CIRCULO", JOptionPane.INFORMATION_MESSAGE);
        }else {
            System.exit(0);
        }
        }
    }
