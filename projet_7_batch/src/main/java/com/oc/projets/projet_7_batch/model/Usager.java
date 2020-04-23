package com.oc.projets.projet_7_batch.model;

public class Usager {

private Long id;
	
	private String nom;
	
	private String prenom;
	
	private String email;
	
	private String role = "USER";

	public Usager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usager(String email) {
		// TODO Auto-generated constructor stub
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Usager [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", password="
				 + ", role=" + role + "]";
	}

}
