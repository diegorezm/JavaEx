import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String ANSI_RED = "\u001B[31m";
        String[] input = {"Informar o total de horas trabalhadas","Listar informações do professor", "Demitir professor", "Encerrar"};
        Professor prof;
        UIManager um = new UIManager();

        
        String nome = JOptionPane.showInputDialog(null, "Diga seu nome:", "CADASTRO", JOptionPane.QUESTION_MESSAGE);
        double matricula = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira sua matricula:", "CADASTRO",JOptionPane.QUESTION_MESSAGE));
        prof = new Professor(matricula,nome);


        while(true){
            um.put("OptionPane.messageForeground", Color.black);
            String output = (String) JOptionPane.showInputDialog(null, "Escolha uma opção:", "FOLHA DE SALÁRIO", JOptionPane.QUESTION_MESSAGE, null,input, input[0]);
            if(output == input[0]){
                double hrs = Double.parseDouble(JOptionPane.showInputDialog(null, "Diga quantas horas você trabalha por mês:", "FOLHA DE SALÁRIO",JOptionPane.QUESTION_MESSAGE));
                double aulas = Double.parseDouble(JOptionPane.showInputDialog(null, "Diga quanto recebe por hora:", "FOLHA DE SALÁRIO",JOptionPane.QUESTION_MESSAGE));
                prof.setHrs(hrs);
                prof.setAulas(aulas);

            }else if(output == input[1]){
                JOptionPane.showMessageDialog(null, prof.dados(), "FOLHA DE SALÁRIO", JOptionPane.INFORMATION_MESSAGE);
            }else if(output == input[2]){
                prof.encerraContrato();
                JOptionPane.showMessageDialog(null, "O contrato de:"+" "+prof.getNome()+" "
                                            +"\nDe numero de matricula:"+" "+prof.getMatricula()+" "
                                            +"\nFoi encerrado.", "ENCERRAMENTO DE CONTRATO", 0);
                 
            }else{
                System.out.println(ANSI_RED+"ENCERRANDO!"+"\u001B[0m");
                System.exit(0);
        }
}
}
}