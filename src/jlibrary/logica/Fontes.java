package jlibrary.logica;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.io.InputStream;
import java.net.URL;
import javax.swing.JLabel;

/**
 *
 * @author Natanael
 */
public class Fontes {

    public static void main(String[] args) throws Exception {
        URL fontUrl = new URL("http://www.webpagepublicity.com/free-fonts/a/Airacobra%20Condensed.ttf");
        //URL fontUrl = new URL("file:///F:/Computer_Science/TexasLED.ttf");
        //InputStream in =  getClass().getResourceAsStream("nome_do_arquivo");
        Font font = Font.createFont(Font.TRUETYPE_FONT, fontUrl.openStream());
        font = font.deriveFont(Font.PLAIN, 20);
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        ge.registerFont(font);

        JLabel l = new JLabel("Natanael Magalhães Cardoso");
        l.setFont(font);
    }

    public void setFont(JLabel jlabel, String fonte, int tamanho) {
        try {
            InputStream in = getClass().getResourceAsStream("/jlibrary/fontes/" + fonte);
            Font font = Font.createFont(Font.TRUETYPE_FONT, in);
            font = font.deriveFont(Font.PLAIN, tamanho);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(font);
            jlabel.setFont(font);
        } catch (Exception ex) {
        }
    }
    
    public void setFont(JLabel[] jlabel, String fonte, int tamanho) {
        try {
            InputStream in = getClass().getResourceAsStream("/jlibrary/fontes/" + fonte);
            Font font = Font.createFont(Font.TRUETYPE_FONT, in);
            font = font.deriveFont(Font.PLAIN, tamanho);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(font);
            for (int i = 0; i < jlabel.length; i++) {
                jlabel[i].setFont(font);
            }
        } catch (Exception ex) {
        }
    }
}
