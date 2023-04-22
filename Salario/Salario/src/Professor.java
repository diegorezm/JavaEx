import java.awt.*;
import javax.swing.*;

public class Professor {
    private double aulas,matri,hrs;
    private String nome;
    private boolean ativo;
    UIManager um = new UIManager();

    // constructor : 
    // - always will have the same name as the class
    // - when not specified the constructor will have no value 
    // - the developer can create value to the constructor at will 
    public Professor(double matricula, String nome){
        this.matri = matricula;
        this.nome = nome;
        ativo = true;
    }
    //set
    public void setHrs(double hrs) {
        this.hrs = hrs;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setAulas(double aulas){
        this.aulas = aulas;
    }
    public void setMatricula(double matri){
        this.matri = matri;
    }

    //get
    public String getNome(){
        return nome;
    }
    public double getHrs() {
        return hrs;
    }
    public double getAulas(){
        return aulas;
    }
    public double getMatricula(){
        return matri;
    }

    //method
    public double calcSalarioMensal(){
        return hrs * aulas;
   }

   public double calculaR(){
    double prc;
    if(calcSalarioMensal() <= 1566.61){
        prc = calcSalarioMensal();
    }else if(calcSalarioMensal() >= 1566.62 && calcSalarioMensal() <= 2347.85){
        prc = calcSalarioMensal() * 7.5 / 100;
    }else if (calcSalarioMensal() >= 2347.86 && calcSalarioMensal() <= 3130.51){
        prc = calcSalarioMensal() * 15 / 100;
    }else if(calcSalarioMensal() >= 3130.52 && calcSalarioMensal() <= 3911.63){
        prc = calcSalarioMensal() * 22.5 / 100;
    }else{
        prc = calcSalarioMensal() * 27.5 / 100;
    }
    return prc;
   } 
    public double calcInss(){
        double inss;
        if(calcSalarioMensal() <= 1174.86){
            inss = (calcSalarioMensal() * 8)/100;
        }else if(calcSalarioMensal() >= 1174.86 && calcSalarioMensal() <= 1958.10){
            inss = (calcSalarioMensal() * 9)/100;
        }else{
            inss = (3916.20 * 11)/100;
        }
    return inss;
   } 

   public double calcSalarioLiquido(){
    double inss = calcInss();
    double renda = calculaR();
    double salBruto = calcSalarioMensal();
    return salBruto - inss - renda;
   }

   public void encerraContrato(){
    um.put("OptionPane.messageForeground", Color.red);
    ativo = false;
   }


   public String dados(){
    String dados;
    if(ativo == false){
        um.put("OptionPane.messageForeground", Color.red);
       dados = "Professor inativo"; 
    }else if (calcSalarioLiquido() == 0){
        um.put("OptionPane.messageForeground", Color.red);
        dados = " Insira os dados do professor antes!"; 
    }else{
        dados= "Folha de pagamento do funcionario(a):" +" "+ nome +"  "+"-" +"  "+ "Matricula:"+"  "+matri +"\n"+"Horas Trabalhadas:" + "  "+ "R$"+hrs + 
            "\n" + "Salário por hora:" + "  " +  "R$" +  aulas + "\n" + "Salário bruto:"+  "  "+"R$"+calcSalarioMensal() +"\n"+"Inss:" + "  " + "R$" +calcInss() + 
            "\n" +"IR" + "  "+"R$" +calculaR() + "\n" + "Salário liquido:"+ "  "+ "R$"+ calcSalarioLiquido(); 
   }
    return dados;
}
}
