
import java.time.LocalDate;
import java.util.Vector;

public class Package {
    private int id;
    private String nome;
    private String descrizione;
    private LocalDate inizio;
    private LocalDate modifica;
    private LocalDate chiusura;
    private LocalDate scadenza;
    //private Vector<Utenti> user;

    /*public void setUser(Vector<Utenti> user) {
        this.user = user;
    }

    public Vector<Utenti> getUser() {
        return user;
    }*/

    public Package(int id, String nome, String descrizione, LocalDate inizio, LocalDate modifica, LocalDate chiusura, LocalDate scadenza /*Vector<Utenti> user*/) {
        this.id = id;
        this.nome = nome;
        this.descrizione = descrizione;
        this.inizio = inizio;
        this.modifica = modifica;
        this.chiusura = chiusura;
        this.scadenza = scadenza;
        //this.user=user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public LocalDate getInizio() {
        return inizio;
    }

    public void setInizio(LocalDate inizio) {
        this.inizio = inizio;
    }

    public LocalDate getModifica() {
        return modifica;
    }

    public void setModifica(LocalDate modifica) {
        this.modifica = modifica;
    }

    public LocalDate getChiusura() {
        return chiusura;
    }

    public void setChiusura(LocalDate chiusura) {
        this.chiusura = chiusura;
    }

    public LocalDate getScadenza() {
        return scadenza;
    }

    public void setScadenza(LocalDate scadenza) {
        this.scadenza = scadenza;
    }
}
