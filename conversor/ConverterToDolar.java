package conversor;

public class ConverterToDolar extends Conversor{

    private double mexicana = 16.93;
    private double euro = 0.90;
    private double libraEsterlina = 0.78;
    private double yen = 140.96;
    private double won = 1275.72;
    private double dolar = 1;
    private double result;

    public double converterDolar(double valor) {
        result = valor * dolar;
        return result;
    }

    public double converterMexicana(double valor) {
        result = valor * mexicana;
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

    
    public double converterYen(double valor) {
        result = valor * yen;
        return result;
    }
    
}
