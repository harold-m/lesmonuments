package com.projet.Monument.Entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin("*")
@Entity @Table(name="departement")
public class Departement {
	@Id 
	private String dep;
	private String nomDep;
	//private String chefLieu;
	private String reg;

//Constructeurs vide 
public Departement() {
	super();
}

//constructeurs avec tous les constructeurs		
public Departement(String dep, String nomDep, Lieu chefLieu,  String reg, List<Lieu> departmentPlaces) {
		super();
		this.dep = dep;
		this.nomDep = nomDep;
		this.chefLieu = chefLieu;
		//this.chefLieu = chefLieu;
		this.reg = reg;
		this.departmentPlaces = departmentPlaces;
	
	}


//constructeurs sans mapping
public Departement(String dep, String nomDep/*,Lieu chefLieuString chefLieu*/, String reg) {
	super();
	this.dep = dep;
	this.nomDep = nomDep;
	//this.chefLieu = chefLieu;
	this.reg = reg;
}

@OneToMany(mappedBy="dept")
private List<Lieu> departmentPlaces = new ArrayList<>();

	@OneToOne
	private Lieu chefLieu;

	
	// les getters et setters
	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public String getNomDep() {
		return nomDep;
	}

	public void setNomDep(String nomDep) {
		this.nomDep = nomDep;
	}


	public String getReg() {
		return reg;
	}

	public void setReg(String reg) {
		this.reg = reg;
	}

	public List<Lieu> getDepartmentPlaces() {
		return departmentPlaces;
	}

	public void setDepartmentPlaces(List<Lieu> departmentPlaces) {
		this.departmentPlaces = departmentPlaces;
	}

	public Lieu getChefLieu() {
		return chefLieu;
	}

	public void setChefLieu(Lieu chefLieu) {
		this.chefLieu = chefLieu;
	}
	

}
