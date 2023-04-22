/*
Implemente um aplicativo para calcular e exibir o total de 
faltas permitidas em uma disciplina.
*/
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        //Criação/ instanciação do objeto
        Disciplina   objDisciplina = new Disciplina(); 
        
        objDisciplina.setNomeDisciplina(JOptionPane.showInputDialog(null,
                "Nome da disciplina","App Faltas Permitidas",
                JOptionPane.QUESTION_MESSAGE));
        
        int ch= Integer.parseInt(JOptionPane.showInputDialog(null,
       "Informe a carga horária da disciplina de "+objDisciplina.getNomeDisciplina(),
       "App Faltas Permitidas",JOptionPane.QUESTION_MESSAGE));

        objDisciplina.setCargaHoraria(ch);

        JOptionPane.showMessageDialog(null,
                "Disciplina: "+objDisciplina.getNomeDisciplina()+
                "\nCarga horária: "+objDisciplina.getCargaHoraria()+
                "\nFaltas permitidas: "+objDisciplina.faltasPermitidas(),
                "App Faltas Permitidas",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
