package profesores;

import java.util.Calendar;

/**
 * Se trata de una clase para comprobar que las otras clases funcionan más o menos.
 *
 * @author USUARIO
 */
public class Coordinador {

    public static void main(String[] args) {
        Universidad universidad = new Universidad("Universidad del Sur", 4);
        Calendar fechaLecturaTesis = Calendar.getInstance();
        Calendar fechaAcreditacion = Calendar.getInstance();

        Profesor colaboradorNoDoctor = new Profesor(1, "García", "García", "Antonio", Categoria.COLABORADOR_NO_DOCTOR);
        System.out.println(colaboradorNoDoctor.presentacionProfesor());

        fechaLecturaTesis.set(2000, Calendar.OCTOBER, 21);
        Profesor colaboradorDoctor = new Profesor(2, "Pérez", "García", "Juan", Categoria.COLABORADOR_DOCTOR, fechaLecturaTesis);
        System.out.println(colaboradorDoctor.presentacionProfesor());

        fechaLecturaTesis.set(1998, Calendar.NOVEMBER, 22);
        fechaAcreditacion.set(2001, Calendar.AUGUST, 3);
        Profesor agregado = new Profesor(3, "Rodríguez", "Martínez", "Pedro", Categoria.AGREGADO, fechaLecturaTesis, fechaAcreditacion);
        System.out.println(agregado.presentacionProfesor());

        fechaLecturaTesis.set(1980, Calendar.FEBRUARY, 13);
        fechaAcreditacion.set(1997, Calendar.JULY, 5);
        Profesor catedratico = new Profesor(4, "Mata", "Rubio", "José", Categoria.CATEDRATICO, fechaLecturaTesis, fechaAcreditacion, 7);
        System.out.println(catedratico.presentacionProfesor());

        System.out.println(universidad.presentacionUniversidad());
    }
}
