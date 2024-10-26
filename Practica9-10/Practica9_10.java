package mx.unam.fi.poo.g1.p910.Practica9_10;

import mx.unam.fi.poo.g1.p910.Practica9_10.*;

/**
 * Clase principal de la Práctica 9_10
 * 
 * @author Grupo 1 de POO
 * @version Octubre de 2024
 */

public class Practica9_10 {

    /**
     * Metodo main
     * 
     * Se ejecuta todo el funcionamiento de la aplicación
     * 
     * @param args -> Arreglo por defecto del metodo main
     */
    public static void main(String[] args) {
        try {
            RevisionVocales cad = new RevisionVocales(IngresaUsuario.IngresaCadena());
            cad.checarVocales();
            System.out.println("La cadena contiene al menos una vocal");
        } catch (NoVowelsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
