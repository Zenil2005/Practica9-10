package mx.unam.fi.poo.g1.p910.Practica9_10;

import mx.unam.fi.poo.g1.p910.Practica9_10.*;

/**
 * Clase que revisa si una cadena contiene vocales y lanza una excepción en caso
 * contrario.
 */
public class RevisionVocales {
    private String cadena;

    /**
     * Constructor que inicializa la cadena.
     *
     * @param cadena -> La cadena que se va a revisar.
     */
    public RevisionVocales(String cadena) {
        setCadena(cadena);
    }

    /**
     * Método set
     * 
     * Establece el valor de la cadena.
     * 
     * @param cadena -> La nueva cadena que se va a establecer.
     */
    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    /**
     * Método get
     * 
     * Devuelve el parámetro cadena.
     * 
     * @return -> La cadena actual.
     */
    public String getCadena() {
        return this.cadena;
    }

    /**
     * Verifica si la cadena contiene al menos una vocal.
     *
     * @throws NoVowelsException Si la cadena no contiene ninguna vocal.
     */
    public void checarVocales() throws NoVowelsException {
        String vocales = "AEIOUaeiou";
        boolean v = false;
        for (int i = 0; i < this.getCadena().length(); i++) {
            char c = this.getCadena().charAt(i);
            int indice = vocales.indexOf(c);
            if (indice != -1) {
                v = true;
            }
        }
        if (v == false) {
            throw new NoVowelsException("La cadena no contiene ninguna vocal...");
        }
    }
}
