package aplicacion;

import dominio.Informe;
import dominio.Explicacion;
import dominio.ExplicacionTipo1;
import dominio.ExplicacionTipo2;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Explicacion> listaExplicaciones = new ArrayList<>();

        Explicacion e1 = new ExplicacionTipo1();
        e1.setInformacionBasica("Información básica de la explicación 1");
        ((ExplicacionTipo1) e1).setEvidenciaAdicional("Evidencia adicional de la explicación 1");
        listaExplicaciones.add(e1);

        Explicacion e2 = new ExplicacionTipo2();
        e2.setInformacionBasica("Información básica de la explicación 2");
        ArrayList<String> efav = new ArrayList<>();
        efav.add("Evidencia a favor 2.1");
        efav.add("Evidencia a favor 2.2");
        ArrayList<String> econtra = new ArrayList<>();
        econtra.add("Evidencia a contra 2.1");
        econtra.add("Evidencia a contra 2.2");
        ((ExplicacionTipo2) e2).setEvidenciasAFavor(efav);
        ((ExplicacionTipo2) e2).setEvidenciasEnContra(econtra);
        listaExplicaciones.add(e2);

        System.out.println(new Informe(listaExplicaciones));
    }
}