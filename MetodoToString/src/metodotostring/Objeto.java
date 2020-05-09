package metodotostring;

/**
 *
 * @author migue
 */
public class Objeto {

    private String nombre;
    private String apellido;

    public Objeto(String nom, String apel) {
        nombre = nom;
        apellido = apel;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }

}
