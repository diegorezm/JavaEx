// Elabore um aplicativo para armazenar o ra, nome, disciplina, nota do instrumento parcialenota 
// do instrumento  principalobtidos  na  disciplina.  Implemente  método  para  calcular  a nota  
// finaldo  aluno sabendo que é o somatório de todos os instrumentos. Exiba o boletim do aluno 
// contendo:ra, nome, disciplinae a nota finalobtida pelo aluno.


import javax.swing.JOptionPane;

import classes.Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno objAluno = new Aluno();

        int Ra = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o Ra:","MENTOR JAVA",JOptionPane.QUESTION_MESSAGE));
        objAluno.setNome(JOptionPane.showInputDialog(null, "Insira seu nome:", "MENTOR JAVA",JOptionPane.QUESTION_MESSAGE));
        objAluno.setDisciplina(JOptionPane.showInputDialog(null, "Insira o nome da sua disciplina:", "MENTOR JAVA",JOptionPane.QUESTION_MESSAGE));

        Float ntParcial = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira Sua nota parcial:","MENTOR JAVA",JOptionPane.QUESTION_MESSAGE));
        Float ntPrincipal = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira sua nota principal:","MENTOR JAVA",JOptionPane.QUESTION_MESSAGE));
        
        objAluno.setRa(Ra);
        objAluno.setParcial(ntParcial);
        objAluno.setPrincipal(ntPrincipal);

        JOptionPane.showMessageDialog(null, objAluno.Boletim(),"MENTOR JAVA", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
