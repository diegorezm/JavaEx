package classes;

public class Aluno {
  private Float ntParcial;
  private Float ntPrincipal;
  private String Disciplina;
  private int  Ra;
  private String  Nome;

  // Get

  public Float getParcial(){
      return ntParcial;
  }
  public Float getPrincipal(){
      return ntPrincipal;
  }
    public String getDiscplina(){
    return Disciplina;
  }
    public int getRa(){
    return Ra;
  }
    public String getNome(){
    return Nome;
  }

  // set
  public void setParcial(float ntParcial){
      this.ntParcial = ntParcial;
  }
    public void setPrincipal(float ntPrincipal){
      this.ntPrincipal = ntPrincipal;
  }
    public void setDisciplina(String Disciplina){
    this.Disciplina = Disciplina; 
  }
  public void setRa(int Ra){
    this.Ra=Ra;
  }
  public void setNome(String Nome){
    this.Nome=Nome;
  }

  // Método

  public float ntFinal(){
    return ntParcial + ntPrincipal;
  } 

  // Boletim
  public String Boletim(){
    String n="Nome"+getNome();
    String ra="\nRa"+getRa();
    String disc="\nDisciplina"+getDiscplina();
    String nota="\nNota final:"+ntFinal();
    return n + ra + disc + nota;
  }
}
