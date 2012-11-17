/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jlibrary.entidades;

/**
 *
 * @author Natanael
 */
public class Preferencia {

    private int idPref;
    private String skin;
    private String idioma;
    private String tipoItem;
    private int idLogin;

    public int getIdPref() {
        return idPref;
    }

    public void setIdPref(int idPref) {
        this.idPref = idPref;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(int idlogin) {
        this.idLogin = idlogin;
    }

    public String getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(String tipoItem) {
        this.tipoItem = tipoItem;
    }
    
}
