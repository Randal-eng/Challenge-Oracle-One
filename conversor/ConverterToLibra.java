package conversor;

public class ConverterToLibra extends Conversor{
    private double mexicana = 21.79;
    private double euro = 1.17;
    private double dolar = 1.29;
    private double yen = 181.50;
    private double won = 1652.66;
    private double libra = 1;
    private double result;

    public double converterLibra(double valor) {
        result = valor * libra;
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
    
    public double converterWon(double valor) {
        result = valor * won;
        return result;
    }
    
    public double converterYen(double valor) {
        result = valor * yen;
        return result;        
    }

    
}
