package com.projet.Monument.Entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity @Table(name="lieu")
public class Lieu {
	
	@Id
	@Column(length=10)
	private String codeInsee;
	
	//private String dep; 
	private String nomCom;
	private double longitude;
	private double latitude;
	
	
	
	@OneToMany(mappedBy="lieu")

	@JsonIgnoreProperties("lieu")
	private List<Monument> monuments/*=new ArrayList<>()*/;
	
	@ManyToOne
	private Departement dept; //departement_lieu;
	
	@OneToOne(mappedBy="chefLieu")
	private Departement departement;
//Constructeurs
	//Constructeurs vide
	public Lieu() {
		super();
	}
	
	//Constructeurs avec attributs stricts de lieu
	public Lieu(String codeInsee,/* Departement dep,*/ String nomCom, double longitude, double latitude) {
	super();
	this.codeInsee = codeInsee;
	//this.dep = dep;
	this.nomCom = nomCom;
	this.longitude = longitude;
	this.latitude = latitude;
}
	
	
	//construecteurs avec tous les attributs
	
	public Lieu(String codeInsee,Departement dept, String nomCom, double longitude, double latitude, List<Monument> monuments/*,
		Departement departement_lieu, Departement departement*/) {
	super();
	this.codeInsee = codeInsee;
	this.dept = dept;
	this.nomCom = nomCom;
	this.longitude = longitude;
	this.latitude = latitude;
	this.monuments = monuments;
	//this.departement_lieu = departement_lieu;
	//this.departement = departement;
}
	
	
	//getters and setters
	public String getCodeInsee() {
		return codeInsee;
	}


	public void setCodeInsee(String codeInsee) {
		this.codeInsee = codeInsee;
	}

	public Departement getDept() {
		return dept;
	}

	public void setDep(Departement dept) {
		this.dept = dept;
	}

	public String getNomCom() {
		return nomCom;
	}

	public void setNomCom(String nomCom) {
		this.nomCom = nomCom;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public List<Monument> getMonuments() {
		return monuments;
	}

	public void setMonuments(List<Monument> monuments) {
		this.monuments = monuments;
	}

	/*public Departement getDepartement_lieu() {
		return departement_lieu;
	}

	public void setDepartement_lieu(Departement departement_lieu) {
		this.departement_lieu = departement_lieu;
	}*/

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
	


}
