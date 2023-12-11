package principal;
import java.util.ArrayList;
public class Main {
    private class A{
        int atributo1, atributo2;
        int metodo2(){
            return atributo1 - atributo2;
        }
    }static void metodoEstatico(){
        System.out.println("Esto es un método estático");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<A> arrayList;arrayList.add("cadena 1");
        this.metodoEstatico();A.metodo2();
    }
}
//Ejec 46: Cuando imprimes un objeto en Java sin proporcionar un método toString() personalizado,
// se utiliza la implementación predeterminada de la clase Object,
// que devuelve el nombre de la clase seguido por el identificador hexadecimal del objeto.
// En este caso, la salida "paquete1.A@6d06d69c"


// Ejec 47: Error: No has inicializado el ArrayList<A> antes de intentar agregar un elemento.
//Error: Estás tratando de agregar una cadena ("cadena 1") a un ArrayList<A>, pero el tipo esperado es A
//Error: No puedes usar this en un contexto estático. Elimina this. del método metodoEstatico()
// y también para llamar al método metodo2() de la clase A.