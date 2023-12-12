package dominio;

import java.util.ArrayList;

public class Informe {
    private final ArrayList<Explicacion> listaDeExplicaciones;

    public Informe(ArrayList<Explicacion> listaDeExplicaciones) {
        this.listaDeExplicaciones = listaDeExplicaciones;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("INFORME\n\n");
        for (Explicacion explicacion : listaDeExplicaciones) {
            sb.append(explicacion.toString()).append("\n");
        }
        return sb.toString();
    }
}
