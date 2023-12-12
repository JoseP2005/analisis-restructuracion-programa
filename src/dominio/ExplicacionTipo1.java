package dominio;

public class ExplicacionTipo1 extends Explicacion {
    private String evidenciaAdicional;

    public void setEvidenciaAdicional(String evidenciaAdicional) {
        this.evidenciaAdicional = evidenciaAdicional;
    }

    @Override
    public String toString() {
        return "INFORME\n\n" + informacionBasica + "\n" + evidenciaAdicional + "\n";
    }
}