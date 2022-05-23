package Polimorfismo;

/**
 *
 * @author luiss
 */
public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    
    Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    public void mostrarInformacion(){
        System.out.println("Persona: " + nombre + " " + apellidos + " Edad: " + edad);
    }
    
}
