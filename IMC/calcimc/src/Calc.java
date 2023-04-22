public class Calc{
    private Double peso, altura;

    // get 
    public Double getPeso(){
        return peso;
    }
    public Double getAltura(){
        return altura;
    }

    //set 
    public void setPeso(Double peso){
        this.peso = peso;
    }
    public void setAltura(Double altura){
        this.altura = altura;
    }

    //method
    public Double calcIMC(){
        Double  alt =Math.pow(altura, 2);
        Double  calc = peso / alt;

        return calc;
    }

}