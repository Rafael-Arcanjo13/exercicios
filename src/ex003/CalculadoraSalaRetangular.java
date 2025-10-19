package ex003;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    public static void main(String[] args) {
        CalculadoraSalaRetangular calculadoraSalaRetangular = new CalculadoraSalaRetangular();

        System.out.println("A area desse retangulo vale: " + calculadoraSalaRetangular.calcularArea(2, 5));
        System.out.println("O perimetro desse retangulo vale: " + calculadoraSalaRetangular.calcularPerimetro(2, 5));
    }

    @Override
    public double calcularArea(double altura, double largura) {
        double area = altura * largura;
        return area;
    }

    @Override
    public double calcularPerimetro(double altura, double largura) {
        double perimetro = (altura * 2) + (largura * 2);
        return perimetro;
    }
}
