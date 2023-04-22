public class Calc {
    private int prim,sec,tre;


    // get 
    public int getPrim(){
        return prim;
    }
    public int getSec(){
        return sec;
    }
    public int getTre(){
        return tre;
    }
    // set 
    public void setPrim(int prim){
        this.prim = prim;
    }
    public void setSec(int sec){
        this.sec = sec;
    }
    public void setTre(int tre){
        this.tre = tre;
    }

    //method
    public int getSoma(){
        int sm = prim + sec + tre;
        return sm;

    }
    public int getProd(){
        int prod = prim * sec * tre;
        return prod;
    }
    public int getMedia(){
        return getProd() / 3 ;
    }
}
