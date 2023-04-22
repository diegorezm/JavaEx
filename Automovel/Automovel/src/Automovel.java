import java.time.LocalDate;

public class Automovel {
    private String marca, modelo,combustivel, cor;
    private double precoCusto,precoVenda;
    private int ano;

    public Automovel(int ano, String marca, String modelo, String combustivel, String cor, double precoCusto) {
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
        this.combustivel = combustivel;
        this.cor = cor;
        this.precoCusto = precoCusto;
        definePrecoVenda();
    }

    public Automovel(String marca, String modelo, String combustivel, String cor, double precoCusto) {
        this.marca = marca;
        this.modelo = modelo;
        this.combustivel = combustivel;
        this.cor = cor;
        this.precoCusto = precoCusto;
        ano =LocalDate.now().getYear();
        definePrecoVenda();
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCombustivel() {
        return this.combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPrecoCusto() {
        return this.precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    private void definePrecoVenda(){
        double  preço = precoCusto;
        double x = 0;
        if(combustivel.equalsIgnoreCase("gasolina")){
            x = preço + (5/100 * preço);
        }else if (combustivel.equalsIgnoreCase("álcool")){
            x = preço + (7/100 * preço); 
        }else if (combustivel.equalsIgnoreCase("disel")){
            x = preço + (15/100 * preço);
        }else if (combustivel.equalsIgnoreCase("gnv")){
            x = preço + (3/100 * preço);
        }else if(combustivel.equalsIgnoreCase("flex") ){
            x = preço + (10/100 * preço);
        }
        precoVenda = x; 
    }
}
