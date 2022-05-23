package pkg006static;

/**
 *
 * @author luiss
 */
public class Persona {
    
    String nombre;
    String apellidos;
    int edad;
    static int numeroPersonas = 0;
    
    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        numeroPersonas++;
    }
    
    static void muestraNumeroPersonas() {
        System.out.println("Hay " + numeroPersonas + " personas");
    }
    
}
