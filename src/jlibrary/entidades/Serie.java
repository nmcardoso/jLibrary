package jlibrary.entidades;

/**
 *
 * @author Natanael
 */
public class Serie {

    private int idSerie;
    private String nome;
    private int idTurno;
    private Turno turno;
    
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

    public int getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }
    

}
