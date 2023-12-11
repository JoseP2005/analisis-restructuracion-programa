package profesores;
import profesores.Acreditacion;
import profesores.Categoria;

import java.text.SimpleDateFormat;
import java.util.Calendar;

class Profesor {
    private int numeroPersonal;
    private String apellido1, apellido2, nombre;
    private Categoria categoria;
    private Calendar fechaLecturaTesis;
    private int nTesisDirigidas;
    private Calendar fechaAcreditacion;

    public Profesor(Object... datos) {
        numeroPersonal = (int) datos[0];
        apellido1 = (String) datos[1];
        apellido2 = (String) datos[2];
        nombre = (String) datos[3];
        categoria = (Categoria) datos[4];
        switch (categoria) {
            case COLABORADOR_DOCTOR:
            case AGREGADO:
            case CATEDRATICO:
                fechaLecturaTesis = (Calendar) datos[5];
                if (categoria == Categoria.AGREGADO || categoria == Categoria.CATEDRATICO)
                    fechaAcreditacion = (Calendar) datos[6];
                if (categoria == Categoria.CATEDRATICO) nTesisDirigidas = (int) datos[7];
        }
    }

    public String presentacionFecha(Calendar fecha) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(fecha.getTime());
    }

    public String presentacionProfesor() {
        String cadenaComun = "Número identificador de personal: " + numeroPersonal + "\n" +
                "Apellidos: " + apellido1 + " " + apellido2 + "\n" +
                "Nombre: " + nombre + "\n";
        String cadenaLecturaTesis = null;
        String cadenaFechaAcreditacion = null;
        String cadenaNTesisDirigidas = "Número de tesis dirigidas: " + nTesisDirigidas + "\n";
        if (categoria == Categoria.COLABORADOR_DOCTOR || categoria == Categoria.AGREGADO || categoria == Categoria.CATEDRATICO)
            cadenaLecturaTesis = "Fecha lectura de tesis: " + presentacionFecha(fechaLecturaTesis) + "\n";
        if (categoria == Categoria.AGREGADO || categoria == Categoria.CATEDRATICO)
            cadenaFechaAcreditacion = "Fecha de acreditación: " + presentacionFecha(fechaAcreditacion) + "\n";
        switch (categoria) {
            case COLABORADOR_NO_DOCTOR:
                return cadenaComun + "Categoría: colaborador no doctor" + "\n";
            case COLABORADOR_DOCTOR:
                return cadenaComun + "Categoría: colaborador doctor" + "\n" + cadenaLecturaTesis + "\n";
            case AGREGADO:
                return cadenaComun + "Categoría: agregado" + "\n" +
                        cadenaLecturaTesis + "\n" +
                        "Tipo de acreditación: Titular de Universidad" + "\n" +
                        cadenaFechaAcreditacion + "\n";
            case CATEDRATICO:
                return cadenaComun + "Categoría: catedrático" + "\n" +
                        cadenaLecturaTesis + "\n" +
                        "Tipo de acreditación: Catedrático de Universidad" + "\n" +
                        cadenaFechaAcreditacion + "\n" +
                        cadenaNTesisDirigidas + "\n";
            default:
                return null;
        }
    }

    Acreditacion getAcreditacion() {
        switch (categoria) {
            case AGREGADO:
                return Acreditacion.TITULAR_DE_UNIVERSIDAD;
            case CATEDRATICO:
                return Acreditacion.CATEDRÁTICO_DE_UNIVERSIDAD;
            default:
                return null;
        }
    }
}