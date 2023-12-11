// Fichero 5
package profesores;

import java.util.ArrayList;
import java.util.List;

/*** Sobre la universidad nos interesa saber su nombrey sus profesores.
 * @author USUARIO
 */
class Universidad {
    private int nProfesores;
    private List<Profesor> tieneProfesores;
    private String nombre;

    public Universidad(String nombre, int nProfesores) {
        this.nombre = nombre;
        this.nProfesores = nProfesores;
        tieneProfesores = new ArrayList<>(nProfesores);
    }

    public String presentacionUniversidad() {
        StringBuilder cadena = new StringBuilder(nombre + "\n");
        for (Profesor profesor : tieneProfesores) {
            cadena.append("\n").append(profesor.presentacionProfesor()).append("\n");
        }
        return cadena.toString();
    }
}
