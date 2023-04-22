public class Calc {
    private Float a, b,c;
    private boolean isTriangulo= true;
    private String tipoTriangulo=" ";

    //set
    public void setA(float a){
        this.a = a;
    }
    public void setB(float b){
        this.b = b;
    }
    public void setC(float c){
        this.c = c;
    }
    

    //get
    public String getTipoTriangulo(){
        return tipoTriangulo;
    }
    public Float getA(){
        return a;
    }
    public Float getB(){
        return b;
    }
    public Float getC(){
        return c;
    }
    public Boolean Triangulo(){
        return isTriangulo;
    }

    //method
    public boolean ehTriangulo(){
    if (a>=b+c || b>=c+a || c>=a+b)
        isTriangulo = false;
    return isTriangulo;
    }

    public void tipoTriangulo(String tipoTriangulo,float a, float b , float c){
        // Equilátero (todos oslados iguais), Isósceles (somente dois lados iguais) ou Escaleno( todosos lados são diferentes);
    if(a == b && a == c){
        tipoTriangulo="Equilátero";
    }else if((a == b) || (a == c)){
        tipoTriangulo="Isóceles";
   }else{
        tipoTriangulo="Escaleno";
    }
    this.tipoTriangulo = tipoTriangulo; 
    }

    public Float periMetro(){
        return a + b +c;
    }
}

