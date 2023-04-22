public class Nomes {
  private String primeiroNome;
  private String segundoNome; 


  public void setPrimeiroNome(String pNome){
      primeiroNome=pNome;
  }

  public void setSegundoNome(String sNome){
      segundoNome=sNome;
  }
  public String NomeCompleto(){
    String result = primeiroNome + " " + segundoNome;
    return result;
  }
}
