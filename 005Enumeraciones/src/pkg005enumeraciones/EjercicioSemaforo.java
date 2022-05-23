package pkg005enumeraciones;

/**
 *
 * @author luiss
 */
public class EjercicioSemaforo {

    public static void main(String[] args) {
        
        Semaforo semaforo1, semaforo2;
        
        semaforo1 = new Semaforo();
        semaforo2 = new Semaforo(ColorSemaforo.VERDE,false);
        semaforo1.setColor(ColorSemaforo.AMARILLO);
        System.out.println("El semaforo1 está con color " + semaforo1.getColor().toString());
        System.out.println("El semaforo2 está con color " + semaforo2.getColor().toString());
    }
    
}
