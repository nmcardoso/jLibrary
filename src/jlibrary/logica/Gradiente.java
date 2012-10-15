package jlibrary.logica;

import java.awt.*;
import javax.swing.*;

public class Gradiente extends JFrame {

    public static void main(String args[]) {
        new Gradiente().setVisible(true);
    }

    public void paint(Graphics g) {
        int rInicial = 240;
        int gInicial = 240;
        int bInicial = 240;
        int rFinal = 150;
        int gFinal = 180;
        int bFinal = 252;

        Dimension d = getSize();
        int maxX = d.width - 1;
        int maxY = d.height - 1;

        for (int iY = 0; iY <= maxY; iY++) {
            int rAtual = (int) ((rFinal - rInicial) * iY / (float) maxY + rInicial);
            int gAtual = (int) ((gFinal - gInicial) * iY / (float) maxY + gInicial);
            int bAtual = (int) ((bFinal - bInicial) * iY / (float) maxY + bInicial);

            g.setColor(new Color(rAtual, gAtual, bAtual));
            g.drawLine(0, iY, maxX, iY);
        }
    }
}