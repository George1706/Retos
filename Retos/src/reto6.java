
//se importa la clase Scanner
import java.util.Scanner;

//nombre del documento
public class reto6 {
    // class main para ejecutar
    public static void main(String[] args) throws Exception {
        // Declaración de variables tipo int
        int tipoCara;
        int tiroAleatorio;
        int tope = 100000;
        int apuesta = 0;
        int cantidadVeces;
        int perdio = 1;
        int vida = 3, i;
        // Declaración de variables tipo String
        String nombre;
        // se imprime un mensaje pidiendo los datos
        System.out.println("juego del casillerazo");
        // Scanner para capturar los datos
        Scanner registrar = new Scanner(System.in);
        System.out.println("ingrese su nombre");
        nombre = registrar.nextLine();
        tiroAleatorio = (int) (Math.random() * 2) + 1;

        // crear condición
        cantidadVeces = (vida - perdio);
        for (i = 1; i <= cantidadVeces; i++) {
            System.out.println("tira una moneda, cara:1 y sello:2");
            tipoCara = registrar.nextInt();
            System.out.println("cuanto va apostar");
            apuesta = registrar.nextInt();
            if (tiroAleatorio == 1 && tipoCara == 1) {
                System.out.println(nombre + "empate respuesta de la maquina fue:" + tiroAleatorio + "tu respuesta es"
                        + tipoCara + "y tu valor final es " + apuesta);
            } else if (tiroAleatorio == 1 && tipoCara == 2) {
                System.out.println(nombre + "salio sello has perdido la respuesta de la maquina fue:" + tiroAleatorio
                        + "tu respuesta es " + tipoCara + "y tu valor final es de: " + (tope - apuesta) + " Le quedan "
                        + (cantidadVeces = (vida - perdio)) + " vidas");
            } else if (tiroAleatorio == 2 && tipoCara == 1) {
                System.out.println(nombre + "salio cara has ganado la respuesta de la maquina fue:" + tiroAleatorio
                        + "tu respuesta es" + tipoCara + "y tu valor final es de: " + (tope + apuesta) + " Le quedan"
                        + (cantidadVeces = (vida)) + "vidas");
            } else if (tiroAleatorio == 2 && tipoCara == 2) {
                System.out.println(nombre + "empate respuesta de la maquina fue:" + tiroAleatorio + "tu respuesta es"
                        + tipoCara + "y tu valor final es " + apuesta);
            }

        }
        System.out.println("Gracias por jugar");

        // Limpiar Buffer
        registrar.close();
    }
}
