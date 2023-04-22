public class Calc {
   private Float raio;  
   // set
   public void setRaio(float raio){
      this.raio = raio;
   }
   //get
   public float getRaio(){
      return raio;
   }

   //method 
   public Float calcArea(){
      Float pi = (float) 3.14; 
      Float area = 2*(raio*pi);
      return area;
   }

   public Float calcPerim(){
      Float pi = (float) 3.14; 
      Float perimetro = 2 * (pi * raio);
      return perimetro;
   }    

   public Float calcDiam(){
      Float diametro = 2 * raio;
      return diametro;
   }
}