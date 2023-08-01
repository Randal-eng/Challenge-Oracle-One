package conversor;

public class ConverterToWon extends Conversor{
    private double mexicana = 0.013;
    private double euro = 0.00071;
    private double dolar = 0.00078;
    private double yen = 0.11;
    private double libraEsterlina = 0.00060;
    private double won = 1;
    private double result;

    public double converterWon(double valor) {
        result = valor * won;
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
    
    public double converterYen(double valor) {
        result = valor * yen;
        return result;
    }
}
