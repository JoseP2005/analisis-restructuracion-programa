package paquete1;
/**
 *
 * @author USUARIO
 */
public class Coordinador {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO code application logic here
        Clase1[] objetos = new Clase1[3];
        objetos[0] = new Clase2();
        objetos[1] = new Clase3();
        objetos[2] = new Clase1();
        System.out.println(objetos[0].miMetodo(4, 5));
        System.out.println(objetos[1].miMetodo(4, 5));
        System.out.println(objetos[2].miMetodo(4, 5));
    }
}
// Ejericio 48
// 11
// 12
// 9
// Explicacion: El metodo miMetodo de la clase Clase2 retorna el valor de la suma de los parametros a y b mas 2,
// el metodo miMetodo de la clase Clase3 retorna el valor de la suma de los parametros a y b mas 3,
// el metodo miMetodo de la clase Clase1 retorna el valor de la suma de los parametros a y b.