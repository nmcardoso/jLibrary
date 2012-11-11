/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jlibrary.entidades;

/**
 *
 * @author Natanael
 */
public class SerieVO {
    private int idSerie;
    private String nome;
    private Turno turno;
    private int qtdLeitor;
    
    public int getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(int idSerie) {
        this.idSerie = idSerie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public int getQtdLeitor() {
        return qtdLeitor;
    }

    public void setQtdLeitor(int qtdLeitor) {
        this.qtdLeitor = qtdLeitor;
    }
}
