import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Prof objProf = new Prof();

        Float hrMin=Float.parseFloat(JOptionPane.showInputDialog(null, "Diga suas horas ministradas por mês:","SALARIO JAVA",JOptionPane.QUESTION_MESSAGE));
        Float hrA=Float.parseFloat(JOptionPane.showInputDialog(null, "Quanto recebe por cada aula:","SALARIO JAVA",JOptionPane.QUESTION_MESSAGE));
        Float iss=Float.parseFloat(JOptionPane.showInputDialog(null, "Quanto paga de inss:","SALARIO JAVA",JOptionPane.QUESTION_MESSAGE));
        objProf.setInss(iss);
        objProf.sethrAula(hrA);
        objProf.sethrMins(hrMin);

        JOptionPane.showMessageDialog(null, "Seu salário é:"+objProf.salario(), "SALARIO JAVA", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

    }
}
