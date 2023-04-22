package faltaspermitidas;

public class Disciplina {
    //Atributos
    private String nomeDisciplina;
    private int cargaHoraria;
    
    //Métodos de Acesso
    public void setNomeDisciplina(String nome){
        nomeDisciplina=nome;
    }
    
    public void setCargaHoraria(int ch){
        cargaHoraria=ch;
    }
    
    public String getNomeDisciplina(){
        return nomeDisciplina;
    }
    
    public int getCargaHoraria(){
        return cargaHoraria;
    }
    
    //Métodos gerais
    public int faltasPermitidas(){
        return cargaHoraria*25/100;
    }
}
