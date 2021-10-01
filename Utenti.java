package common.trello.utenti;

import java.time.LocalDate;

public class Utenti {
	private int id;
	private String username;
	private String mail;
	/*private Vector<Role> ruolo;*/
	private String telefono;
	private LocalDate dataNascita;
	private LocalDate dataIscrizione;
	private LocalDate dataUltimoAccesso;
	private boolean exist;
	public Utenti(int id, String username, String mail, int ruolo, String telefono, LocalDate dataNascita,
			LocalDate dataIscrizione, LocalDate dataUltimoAccesso, boolean exist) {
		super();
		this.id = id;
		this.username = username;
		this.mail = mail;
		/*this.ruolo = ruolo;*/
		this.telefono = telefono;
		this.dataNascita = dataNascita;
		this.dataIscrizione = dataIscrizione;
		this.dataUltimoAccesso = dataUltimoAccesso;
		this.exist = exist;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	/*public Vector<Role> ruolo getRuolo() {
		return ruolo;
	}*/
	/*public Vector<Role> setRuolo(int ruolo) {
		this.ruolo = ruolo;
	}*/
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public LocalDate getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}
	public LocalDate getDataIscrizione() {
		return dataIscrizione;
	}
	public void setDataIscrizione(LocalDate dataIscrizione) {
		this.dataIscrizione = dataIscrizione;
	}
	public LocalDate getDataUltimoAccesso() {
		return dataUltimoAccesso;
	}
	public void setDataUltimoAccesso(LocalDate dataUltimoAccesso) {
		this.dataUltimoAccesso = dataUltimoAccesso;
	}
	public boolean isExist() {
		return exist;
	}
	public void setExist(boolean exist) {
		this.exist = exist;
	}
	
}
