package paquete2;
/**
 *
 * @author USUARIO
 */
public class Coordinador {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println((new Clase1() {
            @Override
            int miMetodo2(int a, int b) {
                return 0;
            }
        }).miMetodo1(4,5));
    }
}

/**
 * Ejercicio 50
 * Escribe por pantalla el resultado de ejecutar el siguiente código:
 * 9
 * porque se llama al método miMetodo1() de la clase Clase1, que devuelve a + b.
 */