/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Clases.NombreAleatorioChica;
import Clases.NombreAleatorioChico;
import Clases.NombresSignificado;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
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
 * realizar. A esta clase le llegan los campos de las ventanas y los modelos
 * donde tenemos los métodos </p>
 *
 * @author denise
 */
public class CAleatorio implements ActionListener {

    private Aleatorio finestra3;
    private Numerología finestra2;

    private NombreAleatorioChica model;
    private NombreAleatorioChico model1;

    private FPrincipal finestra;

    /**
     * Crea el constructor. Se genera una ventana llamada "finestra3".
     *
     * @param finestra3
     */
    public CAleatorio(Aleatorio finestra3) {
        this.finestra3 = finestra3;
    }

    /**
     * Sobreescribimos los actionPermormed de los botones. Para esto hacemos referencia al nombre
     * de su action command. Cada uno llamará a la ventana que contiene la información y al modelo que
     * la trata.
    */
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {

            case "bgenerar":
                int chica = finestra3.dameLaOpciónChica(0);
                if (chica == 0) {
                    finestra3.imprimir(model.generarNombresAleatoriosChica(1));
                } else {
                    finestra3.imprimir(model1.generarNombresAleatoriosChico(1));
                }
                break;

            case "bvolver":
                finestra = new FPrincipal();
                finestra.setOidor(new CAleatorio(finestra3));
                finestra.setVisible(true);
                break;

            case "Bnumerología":
                finestra2 = new Numerología();
                finestra2.setOidor(new CNumerología(finestra2));
                finestra2.setVisible(true);
                break;

            case "baleatorio":
                finestra3 = new Aleatorio();
                finestra3.setOidor(new CAleatorio(finestra3));
                finestra3.setVisible(true);
                break;

            case "bcerrar": 
                Object[] opciones = {"Confirmar", "Canclear"};
                int opción = JOptionPane.showOptionDialog(finestra, "¿Seguro que quieres cerrar la aplicación?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, WindowConstants.EXIT_ON_CLOSE);
                if (opción == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }

                if (opción == JOptionPane.NO_OPTION) {

                    finestra3.dispose();
                }
                break;

        }
    }
}
