/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jlibrary.logica;

import java.util.GregorianCalendar;
import javax.swing.JLabel;



/**
 *
 * @author Natanael
 */
public class Relogio implements Runnable {
    
    JLabel lbl;
    
    public Relogio(JLabel lbl){
        this.lbl = lbl;
    }
    
    public String getHora(){
    GregorianCalendar calendario = new GregorianCalendar();
        int h = calendario.get(GregorianCalendar.HOUR_OF_DAY);
        int m = calendario.get(GregorianCalendar.MINUTE);
        int s = calendario.get(GregorianCalendar.SECOND);

        String hora =
                ((h < 10) ? "0" : "")
                + h
                + ":"
                + ((m < 10) ? "0" : "")
                + m
                + ":"
                + ((s < 10) ? "0" : "")
                + s;
        
        return hora;
    }

    @Override
    public void run() {
        while (true) {
            lbl.setText(getHora());
            try{
                Thread.sleep(1000);
            }catch(Exception ex){
                System.out.println(ex);
            }
        }
    }
}