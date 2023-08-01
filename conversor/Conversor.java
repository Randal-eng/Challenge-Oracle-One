package conversor;

public class Conversor {
    protected double quantity; 
    private double dolar = 0.059;
    private double euro = 0.053;
    private double libraEsterlina = 0.046;
    private double yen = 8.34;
    private double won = 75.43;
    private double mexicana = 1;
    private double result;


    public double getQuantity() {
        return quantity;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    public void setEuro(double euro) {
        this.euro = euro;
    }

    public void setLibraEsterlina(double libraEsterlina) {
        this.libraEsterlina = libraEsterlina;
    }

    public void setYen(double yen) {
        this.yen = yen;
    }

    public void setWon(double won) {
        this.won = won;
    }

    public double converterDolar(double valor) {
        result = valor * dolar;
        return result;
    }

    public double converterEuro(double valor){
        result = valor * euro;
        return result;
    }

    public double converterLibraEsterlina(double valor){
        result = valor * libraEsterlina;
        return result;
    }

    public double converterYen(double valor){
        result = valor * yen;
        return result;
    }

    public double converterWon(double valor){
        result = valor * won;
        return  result;
    }

    public double converterMexicana(double valor){
        result = valor * mexicana;
        return  result;
    }




}
