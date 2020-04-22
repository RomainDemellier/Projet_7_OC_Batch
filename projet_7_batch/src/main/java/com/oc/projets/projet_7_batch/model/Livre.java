package com.oc.projets.projet_7_batch.model;


public class Livre {

	private Long id;
	
	private String titre;
	
	private Auteur auteur;
	
	private String genre;

	private int nbreExemplaires;

	private String fullNameAuteur;

	public Livre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Auteur getAuteur() {
		return auteur;
	}

	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getNbreExemplaires() {
		return nbreExemplaires;
	}

	public void setNbreExemplaires(int nbreExemplaires) {
		this.nbreExemplaires = nbreExemplaires;
	}

	public String getFullNameAuteur() {
		return fullNameAuteur;
	}

	public void setFullNameAuteur(String fullNameAuteur) {
		this.fullNameAuteur = fullNameAuteur;
	}

	@Override
	public String toString() {
		return "Livre [id=" + id + ", titre=" + titre + ", auteur=" + auteur + ", genre=" + genre + ", nbreExemplaires="
				+ nbreExemplaires + ", fullNameAuteur=" + fullNameAuteur + "]";
	}
}
