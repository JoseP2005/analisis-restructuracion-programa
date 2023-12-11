package principal;
import paquete1.A;
public class Main {
    public static void main(String[] args) {
        A a = new A();System.out.println(a);
    }
}
// Cuando imprimes un objeto en Java sin proporcionar un método toString() personalizado,
// se utiliza la implementación predeterminada de la clase Object,
// que devuelve el nombre de la clase seguido por el identificador hexadecimal del objeto.
// En este caso, la salida "paquete1.A@6d06d69c"