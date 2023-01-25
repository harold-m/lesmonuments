package com.projet.Monument.Entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.CrossOrigin;


@Entity @Table(name="celebrite")
public class Celebrite {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private  int numCelebrite;
	
	private String nom;
	private String prenom;
	private String nationalite;
	private String epoque;
	
	//Constructeurs
	public Celebrite () {
		super();
	}
	
	public Celebrite(int numCelebreite, String nom, String prenom, String nationalite, String epoque) {
		super();
		this.numCelebrite = numCelebreite;
		this.nom = nom;
		this.prenom = prenom;
		this.nationalite = nationalite;
		this.epoque = epoque;
	}
	
	@ManyToMany(mappedBy="celeb")
	private List<Monument> lesMonuments;

	public int getNumCelebrite() {
		return numCelebrite;
	}


	public void setNumCelebreite(int numCelebreite) {
		this.numCelebrite = numCelebreite;
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


	public String getNationalite() {
		return nationalite;
	}


	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}


	public String getEpoque() {
		return epoque;
	}


	public void setEpoque(String epoque) {
		this.epoque = epoque;
	}


	public List<Monument> getLesMonument() {
		return lesMonuments;
	}


	public void setLesMonument(List<Monument> lesMonument) {
		this.lesMonuments = lesMonument;
	}
	
}
