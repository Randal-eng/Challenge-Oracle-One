package conversor;

public class ConverterToEuro extends Conversor{
    private double mexicana = 18.71;
    private double dolar = 1.10;
    private double libraEsterlina = 0.86;
    private double yen = 155.69;
    private double won = 1407.53;
    private double euro = 1;
    private double result;

    public double converterEuro(double valor) {
        result = valor * euro;
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
    
    public double converterLibraEsterlina(double valor) {
        result = valor * libraEsterlina;
        return result;
    }
    
    public double converterWon(double valor) {
        result = valor * won;
        return result;
    }
    
    public double converterYen(double valor) {
        result = valor * yen;
        return result;
    }

    
}
