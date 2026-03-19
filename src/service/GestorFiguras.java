package service;

import model.Circulo;
import model.Rectangulo;
import model.Triangulo;

import java.util.ArrayList;

public class GestorFiguras {

    private final ArrayList<Object> figuras;

    //Crea una instancia de figuras
    public GestorFiguras() {
        figuras = new ArrayList<>();
    }

    /**
     * @param figura agrega un elemento a la lista Figuras.
     */
    public void agregarFigura(Object figura) {
        getFiguras().add(figura);
    }

    //Imprime todas las areas de los elementos contenidos en la lista
    public void mostrarAreas() {

        for (Object figura : getFiguras()) {

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

    //Imprime todos los perímetros de los elementos contenidos en la lista
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

    //Dibuja todas las instancias
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

    //Devuelve la lista
    public ArrayList<Object> getFiguras() {
        return figuras;
    }
}
