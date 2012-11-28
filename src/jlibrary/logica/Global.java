package jlibrary.logica;

import java.net.URL;
import jlibrary.entidades.Login;
import jlibrary.entidades.Preferencia;

/**
 *
 * @author Natanael
 */
public class Global {

    public URL headerBg = getClass().getResource("/jlibrary/images/" + preferencia.getSkin());
    public URL mainBg = getClass().getResource("/jlibrary/images/bgy1.png");
    public static Login login;
    public static Preferencia preferencia;

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Preferencia getPreferencia() {
        return preferencia;
    }

    public void setPreferencia(Preferencia preferencia) {
        this.preferencia = preferencia;
    }

    public URL getHeaderBg() {
        return headerBg;
    }

    public void setHeaderBg(URL headerBg) {
        this.headerBg = headerBg;
    }

    public URL getMainBg() {
        return mainBg;
    }

    public void setMainBg(URL mainBg) {
        this.mainBg = mainBg;
    }
}