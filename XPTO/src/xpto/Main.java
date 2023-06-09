// 2.A imobiliária XPTO deseja cercar, com arame, um terreno com c (comprimento) por l (largura). 
// Elabore um aplicativopara calcular a quantidade de arame necessária.O comprimento e a largura 
// deverão ser informados pelo usuário. 

package xpto;
import javax.swing.JOptionPane;
import classes.Terreno;

//  Main
public class Main {

    public static void main(String[] args) {
        Terreno objTerreno = new Terreno();
        
        float comp = Float.parseFloat(JOptionPane.showInputDialog(null, "Comprimento:", "Calcular Área",JOptionPane.QUESTION_MESSAGE));
        float larg = Float.parseFloat(JOptionPane.showInputDialog(null, "Largura:", "Calcular Área",JOptionPane.QUESTION_MESSAGE));

        objTerreno.setComprimento(comp);
        objTerreno.setLargura(larg);
        
        JOptionPane.showMessageDialog(null, "A quantidade de arame é:"+" "+objTerreno.qtdeDeArame(), "Calcular área", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
