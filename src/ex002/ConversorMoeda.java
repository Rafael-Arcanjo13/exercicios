package ex002;

public class ConversorMoeda implements ConverterDolarParaReal {

    public static void main(String[] args) {
        ConversorMoeda conversorMoeda = new ConversorMoeda();
        System.out.println("O valor em real fica: R$" + conversorMoeda.converter(1));
    }

    @Override
    public double converter(double valorEmDolar) {
        double valorEmReal = valorEmDolar * 5.41;
        return valorEmReal;
    }
}
