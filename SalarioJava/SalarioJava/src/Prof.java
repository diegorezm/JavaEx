public class Prof {
   private  Float hrAula,hrMins,inss;

   // set
    public void sethrAula(Float hrAula){
        this.hrAula = hrAula;
    }    
    public void sethrMins(Float hrMins){
        this.hrMins = hrMins;
    }    
    public void setInss(Float inss){
        this.inss = inss;
    }    

   // get
   public Float getHrAula(){
        return hrAula;
   }
    public Float getHrMins(){
        return hrMins;
   }
    public Float getInss(){
        return inss;
   }

   //method
   public Float salarioBruto(){
        Float calc=(hrAula * hrMins) ; 
        return calc;
   }

    public Float desconto(){
        Float calc=salarioBruto() * inss/100; 
        return calc;
   } 
   public Float salario(){
        Float calc= salarioBruto() - desconto(); 
        return calc;
   }
}
