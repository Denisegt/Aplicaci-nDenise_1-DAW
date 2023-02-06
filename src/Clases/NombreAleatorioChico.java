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
public class NombreAleatorioChico {

    /**
     * Genera nombres de chico de forma aleatoria a través de una matriz de Strings. Se le añade un nombre aleatorio a un índice
     * de la matriz. 
     *
     * @param cantidad la cantidad de nombres que se generarán aleatoriamente.
     * @return un Array de String con los nombres generados.
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html"> Método Java Math Random </a>  
     */
    
    public static String[] generarNombresAleatoriosChico(int cantidad) {
        String[] nombresAleatorios = new String[cantidad];

        String[] nombresChico = {"Sergio", "Paul", "Víctor", "Iván", "Alejandro", "Arturo", "Juan", "Ignacio",
            "Axel", "Jose", "Pablo", "Rubén", "Carlos", "Daniel", "Jorge", "David",
            "Miguel"};

        for (int i = 0; i < cantidad; i++) {
            nombresAleatorios[i] = nombresChico[(int) (Math.floor(Math.random() * ((nombresChico.length - 1) - 0 + 1) + 0))] + " ";
        }
        return nombresAleatorios;
    }

}
