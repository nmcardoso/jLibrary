package jlibrary.logica;

import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

/**
 *
 * @author Natanael
 */
public class Centralizar {

    public Centralizar(Dialog dialog, Dimension size) {
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        dialog.setLocation((tela.width - size.getSize().width) / 2, (tela.height - size.getSize().height) / 2);
    }

    public Centralizar(Frame frame, Dimension size) {
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((tela.width - size.getSize().width) / 2, (tela.height - size.getSize().height) / 2);
    }
}
