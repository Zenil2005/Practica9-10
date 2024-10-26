package mx.unam.fi.poo.g1.p910.Practica9_10;

import java.util.Scanner;

/**
 * Clase que proporciona un método para ingresar una cadena de texto por
 * consola.
 */
public class IngresaUsuario {

    /**
     * Solicita al usuario que ingrese una cadena.
     *
     * @return -> La cadena ingresada por el usuario.
     */
    public static String IngresaCadena() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una cadena");
        String cad = scanner.nextLine();
        scanner.close();
        return cad;
    }
}
