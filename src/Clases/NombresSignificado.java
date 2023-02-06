/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author denise
 */
public class NombresSignificado {

    /**
     * Devuelve un significado de un String (tu nombre). Esto lo hace obteniendo
     * el último dígito que da la cifra de la suma del String.
     *
     * @param nombre
     * @return String con el significado del nombre.
     */
    public String DameElSignificado(String nombre) {
        nombre = nombre.toUpperCase();
        nombre = deixaLletres(nombre);
        int suma = sumaCaracters(nombre);
        suma = reduirXifres(suma);

        switch (suma) {
            case 1:
                return "El liderazgo puro, la energía, el individualismo y el egoísmo material";
            case 2:
                return "La dualidad, la pareja que puede ver los dos lados de cualquier situación";
            case 3:
                return "La expansión";
            case 4:
                return "El constructor de mente y consciencia";
            case 5:
                return "La libertad, la polémica, la felicidad y la controversia.";
            case 6:
                return "La justicia y el orden";
            case 7:
                return "La seguridad y protección";
            case 8:
                return "El poder";
            case 9:
                return "El misterio";
        }
        return "?";
    }

    /**
     * Recibe un número y obtiene el último dígito de la suma de sus carácteres.
     * @param num
     * @return int
     */
    private static int reduirXifres(int num) {
        int suma;
        do {
            suma = 0;
            while (num > 0) {
                suma = suma + num % 10;
                num /= 10;
            }
            num = suma;
        } while (suma >= 10);
        return suma;
    }

    /**
     * Recibe un texto y obtiene el índice del carácter. Cada índice va añandiéndose a la suma.
     * @param text
     * @return int El cual será la suma
     */
    private static int sumaCaracters(String text) {
        int suma = 0;
        for (int i = 0; i < text.length(); i++) {
            int c = text.charAt(i);
            suma += text.charAt(i);
        }
        return suma;
    }

    /**
     * Recoge un texto y deja solo sus letras, ningún carácter más. Llama a esUnaLletra.
     * @param text
     * @return String
     * @see esUnaLletra
     */
    private static String deixaLletres(String text) {
        String cadSense = "";
        for (int i = 0; i < text.length(); i++) {
            if (esUnaLletra(text.charAt(i))) {
                cadSense += text.charAt(i);
            }
        }
        return cadSense;
    }

    /**
    * Dice si un carácter es una letra o no lo es.
    * @return <code> true </code> si es una de las letras guardadas en el String "lletres"  
    */
    private static boolean esUnaLletra(char caracter) {
        caracter = Character.toLowerCase(caracter);
        String lletres = "qwertyuiopñlkjhgfdsazxcvbnméóíáúòèàüïç";
        for (int i = 0; i < lletres.length(); i++) {
            if (lletres.charAt(i) == caracter) {
                return true;
            }
        }
        return false;
    }
}
