package classes;

public class Terreno {

    //Atributos
    private float comprimento;
    private float largura;

    //Métodos de Acesso
    public float getComprimento() {
        return comprimento;
    }
    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }
    public float getLargura() {
        return largura;
    }
    public void setLargura(float largura) {
        this.largura = largura;
    }

    //Método geral
    public float qtdeDeArame(){
        return comprimento * 2+largura*2;
    }
}
