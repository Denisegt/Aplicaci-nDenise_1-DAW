/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicaciónnombres;

import Control.CAleatorio;
import Control.CFPrincipal;
import Control.CNumerología;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import vista.Aleatorio;
import vista.FPrincipal;
import vista.Numerología;

/**
 * @version 1.1
 * @author DeniseGT
 */
public class Inici {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FPrincipal f = new FPrincipal();
        Numerología n = new Numerología();
        Aleatorio a = new Aleatorio();

        CFPrincipal c = new CFPrincipal(f);
        CNumerología m = new CNumerología(n);
        CAleatorio s = new CAleatorio(a);

        f.setOidor(c);
        n.setOidor(m);
        a.setOidor(s);

        f.setVisible(true);

    }

}
