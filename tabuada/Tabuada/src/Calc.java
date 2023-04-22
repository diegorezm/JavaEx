public class Calc {
   private byte num; 
   public Byte getNum(){
    return num;
   }
   public void setNum(Byte num){
    this.num = num;
   }

   public String tabuada(){
    String b = "";
    for(int a = 1; a <= 10; a++){
       b+=num+"x"+a +"="+num*a+"\n";
    }
    return b;
    }
   }