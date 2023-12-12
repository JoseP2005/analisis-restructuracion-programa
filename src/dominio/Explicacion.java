package dominio;

import java.util.ArrayList;

public abstract class Explicacion {
    protected String informacionBasica;

    public void setInformacionBasica(String informacionBasica) {
        this.informacionBasica = informacionBasica;
    }

    public abstract String toString();
}