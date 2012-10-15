/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jlibrary.logica;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Natanael
 */
public class NewClass {

    public static void main(String[] args) {
        try {
            String[] cmdarray = new String[3];
            cmdarray[0] = "cmd.exe";
            cmdarray[1] = "/C";
            cmdarray[2] = "C:\\Users\\Natanael\\Documents\\private\\ultimahora.txt";
            Process p = Runtime.getRuntime().exec(cmdarray);
            p = null;
        } catch (IOException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
