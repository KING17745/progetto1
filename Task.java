package com.proj.company;

import java.time.LocalDate;
import java.util.Vector;

public class Task {
	//variabili
	
	private int id_task;
	//private Vector<Utenti> user;
	private String name_task;
	private String description;
	private LocalDate date_start;
	private LocalDate date_finish;
	private int id_status;
	private int id_project;
	
	//costruttore
	public Task(int id_task,/*Vector<Utenti> user*/ String name_task, String description, LocalDate date_start, LocalDate date_finish,
			int id_status, int id_project) {

		this.id_task = id_task;
		//this.user=user;
		this.name_task = name_task;
		this.description = description;
		this.date_start = date_start;
		this.date_finish = date_finish;
		this.id_status = id_status;
		this.id_project = id_project;
	}

	public int getId_task() {
		return id_task;
	}
	
	public void setId_task(int id_task) {
		this.id_task = id_task;
	}
	
	/*public Vector<Utenti> getUser() {
    	return user;
	}
	
	public void setUser(Vector<Utenti> user) {
    	this.user = user;
	}
	 */

	public String getName_task() {
		return name_task;
	}

	public void setName_task(String name_task) {
		this.name_task = name_task;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDate_start() {
		return date_start;
	}

	public void setDate_start(LocalDate date_start) {
		this.date_start = date_start;
	}

	public LocalDate getDate_finish() {
		return date_finish;
	}

	public void setDate_finish(LocalDate date_finish) {
		this.date_finish = date_finish;
	}

	public int getId_status() {
		return id_status;
	}

	public void setId_status(int id_status) {
		this.id_status = id_status;
	}

	public int getId_project() {
		return id_project;
	}

	public void setId_project(int id_project) {
		this.id_project = id_project;
	}
	
	
	
}
