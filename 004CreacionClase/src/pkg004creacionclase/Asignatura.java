package pkg004creacionclase;

/**
 *
 * @author luiss
 */
public class Asignatura {
    
    private String nombre;
    private String codigo;
    private int curso;
    
    public Asignatura(String nombre, String codigo, int curso) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.curso = curso;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    } 
    
    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public int getCurso() {
        return curso;
    }
    
    public void setCurso(int curso) {
        this.curso = curso;
    }
}
