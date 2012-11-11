/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jlibrary.entidades;

/**
 *
 * @author Natanael
 */
public class LeitorVO {

    private int idLeitor;
    private String leitor;
    private String turno;
    private String serie;

    public int getIdLeitor() {
        return idLeitor;
    }

    public void setIdLeitor(int idLeitor) {
        this.idLeitor = idLeitor;
    }

    public String getLeitor() {
        return leitor;
    }

    public void setLeitor(String leitor) {
        this.leitor = leitor;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
}
