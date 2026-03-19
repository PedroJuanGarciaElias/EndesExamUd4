package model;

public class Circulo implements Calculos {

    private double radio;

    /**
     * @param radio es un atributo utilizado en la mayoria de metodos
     */
    public Circulo(double radio) {
        this.setRadio(radio);
    }

    /**
     * @return calcularArea() calcula y devuelve el area de la instancia (implementado de Calculos)
     */
    @Override
    public double calcularArea() {
        return 3.1416 * getRadio() * getRadio();
    }

    /**
     * @return calcularPerimetro() calcula y devuelve el perímetro de la instancia (implementado de Calculos)
     */
    @Override
    public double calcularPerimetro() {
        return 2 * 3.1416 * getRadio();
    }

    //Dibuja el circulo
    public void dibujar() {
        System.out.println("Dibujando circulo de radio " + getRadio());
    }

    //Devuelve el radio
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio atributo que cambia el radio
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
}
