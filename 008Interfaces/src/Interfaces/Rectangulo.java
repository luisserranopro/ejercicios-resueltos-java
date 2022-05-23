package Interfaces;

/**
 *
 * @author luiss
 */
public class Rectangulo implements Figura{

    int ancho, alto;
    
    public Rectangulo (int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    
    @Override
    public int area() {
        return this.ancho * this.alto;
    }
    
}
