package com.projet.Monument.Entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.JoinColumn;

   
@Entity @Table(name="monument")
public class Monument {
	
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(length=10)
	private String codeM;
	
	private String nom;
	private String proprietaire;
	private String typeMonument;
	private double longitude;
	private double latitude;
	
	
	
@ManyToOne
@Cascade(CascadeType.ALL)
@JsonIgnoreProperties("monuments")
	private Lieu lieu;

//private Long code=lieu.getCodeInsee();


@ManyToMany
@JoinTable(name="associea", joinColumns=@JoinColumn(name="codeM"),
inverseJoinColumns=@JoinColumn(name="numCelebrite"))
@Cascade(CascadeType.ALL)
	private List<Celebrite> celeb = new ArrayList<>();
 
//Les constructeurs 

//constructeurs sans constructeurs 



public Monument() {
	super();
}
//constructeurs avec les attributs stricts de monument




public Monument(String codeM, String nom, String proprietaire, String typeMonument, double longitude, double latitude) {
	super();
	this.codeM = codeM;
	this.nom = nom;
	this.proprietaire = proprietaire;
	this.typeMonument = typeMonument;
	this.longitude = longitude;
	this.latitude = latitude;
}



//constructeurs avec tous les attributs

	public Monument(String codeM, String nom, String proprietaire, String typeMonument, double longitude, double latitude,
		Lieu lieu) {
	super();
	this.codeM = codeM;
	this.nom = nom;
	this.proprietaire = proprietaire;
	this.typeMonument = typeMonument;
	this.longitude = longitude;
	this.latitude = latitude;
	this.lieu=lieu;
	
	//this.celeb = celeb;
}





	public String getCodeM() {
		return codeM;
	}


	public void setCodeM(String codeM) {
		this.codeM = codeM;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getProprietaire() {
		return proprietaire;
	}


	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	}


	public String getTypeMonument() {
		return typeMonument;
	}


	public void setTypeMonument(String typeMonument) {
		this.typeMonument = typeMonument;
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

    @Override
    public String toString() {
        return "[" + this.nom + "]";
    }


	public Lieu getLieu() {
		return lieu;
	}


	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}


	public List<Celebrite> getCeleb() {
		return celeb;
	}


	public void setCeleb(List<Celebrite> celeb) {
		this.celeb = celeb;
	}


}
