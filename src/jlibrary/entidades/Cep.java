/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jlibrary.entidades;

/**
 *
 * @author Natanael
 */
public class Cep {

    private int idCep;
    private String cep;
    private Cidade cidade;
    private Estado estado;

    public int getIdCep() {
        return idCep;
    }

    public void setIdCep(int idCep) {
        this.idCep = idCep;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

}
