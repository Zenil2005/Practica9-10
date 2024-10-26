package mx.unam.fi.poo.g1.p910.Practica9_10;

/**
 * Excepción que se lanza cuando no se encuentran vocales en una cadena.
 */
public class NoVowelsException extends Exception {

    /**
     * Constructor del mensaje de error.
     *
     * @param mensaje -> El mensaje de error de la excepción.
     */
    public NoVowelsException(String mensaje) {
        super(mensaje);
    }
}
