/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jlibrary.logica;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Natanael
 */
public class Teste {

    JLabel lbl = new JLabel();
    
    public Teste() {
        Thread t = new Thread(new Relogio(lbl));
        t.start();
        JOptionPane.showConfirmDialog(null, lbl.getText());
    }

    public static void main(String args[]) {
        new Teste();
    }
}
