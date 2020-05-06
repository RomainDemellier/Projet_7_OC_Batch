package com.oc.projets.projet_7_batch.model;

import java.time.LocalDate;

public class Emprunt {

	private Long id;
	
	private Exemplaire exemplaire;
	
	private Usager usager;
	
	private LocalDate dateEmprunt;
	
	private LocalDate dateRetour;
	
	private Boolean prolonge;
	
	private Boolean actif;

	public Emprunt() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Exemplaire getExemplaire() {
		return exemplaire;
	}

	public void setExemplaire(Exemplaire exemplaire) {
		this.exemplaire = exemplaire;
	}

	public Usager getUsager() {
		return usager;
	}

	public void setUsager(Usager usager) {
		this.usager = usager;
	}

	public LocalDate getDateEmprunt() {
		return dateEmprunt;
	}

	public void setDateEmprunt(LocalDate dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}

	public Boolean getActif() {
		return actif;
	}

	public void setActif(Boolean actif) {
		this.actif = actif;
	}

	public LocalDate getDateRetour() {
		return dateRetour;
	}

	public Boolean getProlonge() {
		return prolonge;
	}

	public void setDateRetour(LocalDate dateRetour) {
		this.dateRetour = dateRetour;
	}

	public void setProlonge(Boolean prolonge) {
		this.prolonge = prolonge;
	}

	@Override
	public String toString() {
		return "Emprunt [id=" + id + ", exemplaire=" + exemplaire + ", usager=" + usager + ", dateEmprunt=" + dateEmprunt
				+ ", dateRetour=" + dateRetour + ", prolonge=" + prolonge + ", actif=" + actif + "]";
	}
}
