package conversor;

public class ConverterToYen extends Conversor{
    private double mexicana = 0.12;
    private double euro = 0.0064;
    private double dolar = 0.0071;
    private double libraEsterlina = 0.0055;
    private double won = 9.11;
    private double yen = 1;
    private double result;

    
    public double converterYen(double valor) {
        result = valor * yen;
        return result;
    }

    public double converterMexicana(double valor) {
        result = valor * mexicana;
        return result;
    }
    
    public double converterDolar(double valor) {
        result = valor * dolar;
        return result;
    }
    
    public double converterEuro(double valor) {
        result = valor * euro;
        return result;
    }
    
    public double converterLibraEsterlina(double valor) {
        result = valor * libraEsterlina;
        return result;
    }
    
    public double converterWon(double valor) {
        result = valor * won;
        return result;
    }



}
