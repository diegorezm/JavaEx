import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) throws Exception {
        var calc = new Calc();
        Double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Diga sua altura:", "IMC", JOptionPane.QUESTION_MESSAGE));
        Double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Diga seu peso:", "IMC", JOptionPane.QUESTION_MESSAGE));
        calc.setAltura(altura);
        calc.setPeso(peso);

        var imc=calc.calcIMC();
        if(imc>30){
            // obesidade
                    JOptionPane.showMessageDialog(null, "Seu peso é:"+calc.getPeso()+"\nSua altura é:"+calc.getAltura()+"\nSeu IMC é:"+calc.calcIMC()+"\nVocê está no quadro de obesidade (Acima de 30 no imc)", "IMC",JOptionPane.INFORMATION_MESSAGE);

        }else if(imc >= 24.9 && imc <= 30){
            // excesso de peso
                    JOptionPane.showMessageDialog(null, "Seu peso é:"+calc.getPeso()+"\nSua altura é:"+calc.getAltura()+"\nSeu IMC é:"+calc.calcIMC()+"\nVocê está com excesso de peso (entre 24 e 30)", "IMC",JOptionPane.INFORMATION_MESSAGE);
 
        }else if(imc>= 18.6 && imc <= 24.9){
            // normal

                    JOptionPane.showMessageDialog(null, "Seu peso é:"+calc.getPeso()+"\nSua altura é:"+calc.getAltura()+"\nSeu IMC é:"+calc.calcIMC()+"\nSeu peso está normal.", "IMC",JOptionPane.INFORMATION_MESSAGE);
        }else if(imc < 18.6){
            // abaixo do peso
                    JOptionPane.showMessageDialog(null, "Seu peso é:"+calc.getPeso()+"\nSua altura é:"+calc.getAltura()+"\nSeu IMC é:"+calc.calcIMC()+"\nVocê está abaixo do peso.", "IMC",JOptionPane.INFORMATION_MESSAGE);

        }
    }
}
