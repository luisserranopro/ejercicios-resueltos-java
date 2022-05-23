package Interfaces;

/**
 *
 * @author luiss
 */
public class Triangulo implements Figura{
    
    int base, altura;
    
    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public int area() {
        return base * altura / 2;
    }
}
