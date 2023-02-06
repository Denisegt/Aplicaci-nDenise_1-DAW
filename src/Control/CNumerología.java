/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Clases.NombresSignificado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import vista.Aleatorio;
import vista.FPrincipal;
import vista.Numerología;

/**
 * Sobreescribe los ActionPermormed de los componentes de la ventana. Hace un
 * control de relación entre el usuario y la ventana.
 *
 * <p>
 * Así pues, cada botón seleccionado pedirá al modelo las acciones que se deben
 * realizar. A esta clase le llegan los campos de las ventanas y del modelo
 * donde tenemos los métodos </p>
 *
 * @author denise
 */
public class CNumerología implements ActionListener {

    private Numerología finestra2;
    private NombresSignificado model;
    private FPrincipal finestra;
    private Aleatorio finestra3;
    
    /**
     * Crea el constructor. Se genera una ventana llamada "finestra2" y un modelo "NomberesSignificado".
     * 
     * @param finestra3
     */
    public CNumerología(Numerología finestra2) {
        this.finestra2 = finestra2;
        model = new NombresSignificado();
    }

    /**
     * Sobreescribimos los actionPermormed de los botones. Para esto hacemos
     * referencia al nombre de su action command. Cada uno llamará a la ventana
     * que contiene la información y al modelo que la trata.
     */

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "bEnviarNombre":
                String texto = finestra2.dameElTexto();
                if (finestra2.dameElTexto().isEmpty()) {
                    JOptionPane.showMessageDialog(finestra2, "Introduce un texto");
                    finestra2.muestra(" ");
                } else {
                    texto = model.DameElSignificado(texto);
                    finestra2.muestra(texto);
                    finestra2.borraElTexto(texto);
                }
                break;

            case "cSaberMás":
                JOptionPane.showMessageDialog(finestra2, "<html><body><br> <b>Sobre la numerología: </b> <br> <br> La numerología es un conjunto de creencias o tradiciones que pretende establecer <br> <b> una relación oculta entre los números, los seres vivos y las fuerzas físicas o espirituales </b>. <br> También es una práctica adivinatoria a través de los números </body></html>", "Numerolgía", JOptionPane.INFORMATION_MESSAGE);
                break;

            case "bvolver":
                finestra2.dispose();
                finestra = new FPrincipal();
                finestra.setOidor(new CNumerología(finestra2));
                finestra.setVisible(true);
                break;

            case "baleatorio":
                finestra3 = new Aleatorio();
                finestra3.setOidor(new CAleatorio(finestra3));
                finestra3.setVisible(true);
                break;
                
            case "Bnumerología":
                finestra2 = new Numerología();
                finestra2.setOidor(new CNumerología(finestra2));
                finestra2.setVisible(true);
                break;

            case "bcerrar":
                Object[] opciones = {"Confirmar", "Canclear"};
                int opción = JOptionPane.showOptionDialog(finestra, "¿Seguro que quieres cerrar la aplicación?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, WindowConstants.EXIT_ON_CLOSE);
                if (opción == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
                break;
        }

    }
}
