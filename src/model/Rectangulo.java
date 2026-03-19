package model;

public class Rectangulo implements Calculos {

    private double ancho;
    private double alto;

    /**
     * @param ancho atributo utilizado en varios metodos
     * @param alto atributo utilizado en varios metodos
     */
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    /**
     * @return calcularArea() calcula y devuelve el area de la instancia (implementado de Calculos)
     */
    @Override
    public double calcularArea() {
        return getAncho() * getAlto();
    }

    /**
     * @return calcularPerimetro() calcula y devuelve el perimetro de la instancia (implementado de Calculos)
     */
    @Override
    public double calcularPerimetro() {
        return 2 * getAncho() + 2 * getAlto();
    }

    //Dibuja el ancho y el alto de la instancia
    public void dibujar() {
        System.out.println("Dibujando rectangulo " + getAncho() + "x" + getAlto());
    }

    //Devuelve el ancho
    public double getAncho() {
        return ancho;
    }

    //Devuelve el alto
    public double getAlto() {
        return alto;
    }

    /**
     * @param ancho atributo que cambia el ancho
     */
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    /**
     * @param alto atributo que cambia el alto
     */
    public void setAlto(double alto) {
        this.alto = alto;
    }
}
