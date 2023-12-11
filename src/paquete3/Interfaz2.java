package paquete3;
/**
 *
 * @author USUARIO
 */
public interface Interfaz2 {
    int miMetodo21(int a, int b);
    int miMetodo22(int a, int b);
}
/**public class Clase1 implements Interfaz1, Interfaz2 {
    int miMetodo11(){
        System.out.println("Introduzca un número");
        int a = Integer.parseInt(br.readLine());
        System.out.println("Introduzca otro número");
        int b = Integer.parseInt(br.readLine());
        return a + b + 11;
    }
    int miMetodo21(int a, int b){
        return a + b + 21;
    }
    int miMetodo22(int a, int b){
        return a + b + 21;
    }
}

/**
 * Ejercicio 49
 * Errores:
 * Falta de importación y declaración de BufferedReader: En el método miMetodo11() de la clase Clase1,
 * estás utilizando br.readLine() sin importar la clase BufferedReader ni declarar un objeto BufferedReader.
 * Para corregir esto, necesitas importar la clase BufferedReader y declarar un objeto antes de utilizarlo.
 *
 * Visibilidad incorrecta de los métodos de las interfaces: Los métodos de una interfaz son públicos por defecto,
 * por lo que en la implementación de la interfaz,
 * debes usar la palabra clave public para especificar que estás implementando un método público.
 *
 * Métodos no coincidentes con las interfaces:
 * Los métodos de la clase Clase1 que implementan las interfaces deben coincidir en nombre,
 * tipo de retorno y parámetros con los métodos declarados en las interfaces.
 * En este caso, miMetodo11() no coincide con miMetodo11() de la interfaz Interfaz1.
 */