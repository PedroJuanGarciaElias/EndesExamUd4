public class Triangulo {

    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        this.setBase(base);
        this.setAltura(altura);
        this.setLado1(lado1);
        this.setLado2(lado2);
        this.setLado3(lado3);
    }

    public double calcularArea() {
        return (getBase() * getAltura()) / 2;
    }

    public double calcularPerimetro() {
        return getLado1() + getLado2() + getLado3();
    }

    public void dibujar() {
        System.out.println("Dibujando triangulo");
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
}
