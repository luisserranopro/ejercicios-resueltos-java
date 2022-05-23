package pkg005enumeraciones;

/**
 *
 * @author luiss
 */

enum ColorSemaforo {ROJO, AMARILLO, VERDE};

public class Semaforo {
    
    ColorSemaforo color;
    boolean parpadeando;
    
    public Semaforo(){
        color = ColorSemaforo.ROJO;
        parpadeando = false;
    }
    
    public Semaforo(ColorSemaforo color, boolean parpadeando) {
        this.color = color;
        this.parpadeando = parpadeando;
    }
    
    void setColor(ColorSemaforo color) {
        this.color = color;
    }
    
    ColorSemaforo getColor() {
        return color;
    }
    
    void setParpadeando(boolean parpadeando) {
        this.parpadeando = parpadeando;
    }
    
    boolean getParpadeando() {
        return parpadeando;
    }
    
}
