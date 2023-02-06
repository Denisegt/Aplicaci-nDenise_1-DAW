/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Random;

/**
 *
 * @author denise
 */
public class NombreAleatorioChica {

    /**
     * Genera nombres de chica de forma aleatoria a través de una matriz de Strings. Se le añade un nombre aleatorio a un índice
     * de la matriz. 
     *
     * @param cantidad la cantidad de nombres que se generarán aleatoriamente.
     * @return un Array de String con los nombres generados.
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html"> Método Java Math Random </a>  
     */
    
    public static String[] generarNombresAleatoriosChica(int cantidad) {
        String[] nombresAleatorios = new String[cantidad];

        String[] nombresChica = {"Andrea", "Lucía", "Celeste", "Marina", "Nerea", "Luna", "Marisa",
            "Cecilia", "Sara", "Ruth", "Elsa", "Judith", "Maite", "Vicenta", "Carmina", "Verónica"};

        for (int i = 0; i < cantidad; i++) {
            nombresAleatorios[i] = nombresChica[(int) (Math.floor(Math.random() * ((nombresChica.length - 1) - 0 + 1) + 0))] + " ";
        }
        return nombresAleatorios;
    }

}
