package dominio;

import java.util.ArrayList;

public class ExplicacionTipo2 extends Explicacion{
        private ArrayList<String> evidenciasAFavor;
        private ArrayList<String> evidenciasEnContra;

        public void setEvidenciasAFavor(ArrayList<String> evidenciasAFavor) {
            this.evidenciasAFavor = evidenciasAFavor;
        }

        public void setEvidenciasEnContra(ArrayList<String> evidenciasEnContra) {
            this.evidenciasEnContra = evidenciasEnContra;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("INFORME\n\n" + informacionBasica + "\n");
            if (evidenciasAFavor != null) {
                for (String evidencia : evidenciasAFavor) {
                    sb.append(evidencia).append("\n");
                }
            }
            if (evidenciasEnContra != null) {
                for (String evidencia : evidenciasEnContra) {
                    sb.append(evidencia).append("\n");
                }
            }
            return sb.toString();
        }
}