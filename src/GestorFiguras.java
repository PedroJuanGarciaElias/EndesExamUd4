import java.util.ArrayList;

public class GestorFiguras {

    private final ArrayList<Object> figuras;

    public GestorFiguras() {
        figuras = new ArrayList<>();
    }

    public void agregarFigura(Object figura) {
        getFiguras().add(figura);
    }

    public void mostrarAreas() {

        for (Object figura : getFiguras()) {

            // horrible uso de instanceof
            if (figura instanceof Circulo circulo) {
                System.out.println("Area circulo: " + circulo.calcularArea());
            }

            if (figura instanceof Rectangulo rectangulo) {
                System.out.println("Area rectangulo: " + rectangulo.calcularArea());
            }

            if (figura instanceof Triangulo rectangulo) {
                System.out.println("Area triangulo: " + rectangulo.calcularArea());
            }
        }
    }

    public void mostrarPerimetros() {

        for (Object figura : getFiguras()) {

            if (figura instanceof Circulo circulo) {
                System.out.println("Perimetro circulo: " + circulo.calcularPerimetro());
            }

            if (figura instanceof Rectangulo rectangulo) {
                System.out.println("Perimetro rectangulo: " + rectangulo.calcularPerimetro());
            }

            if (figura instanceof Triangulo triangulo) {
                System.out.println("Perimetro triangulo: " + triangulo.calcularPerimetro());
            }
        }
    }

    public void dibujarTodo() {

        for (Object figura : getFiguras()) {

            if (figura instanceof Circulo) {
                ((Circulo) figura).dibujar();
            }

            if (figura instanceof Rectangulo) {
                ((Rectangulo) figura).dibujar();
            }

            if (figura instanceof Triangulo) {
                ((Triangulo) figura).dibujar();
            }
        }
    }

    public ArrayList<Object> getFiguras() {
        return figuras;
    }
}
