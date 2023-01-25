package com.projet.Monument.Services;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.data.rest.core.config.Projection;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.projet.Monument.Entities.Monument;


@Repository
@CrossOrigin(origins="*")

public interface IMonumentService {
	
	
	// pour remplir la bdd
	List<Monument> findAllMonument();
	

	Monument findById(String id);
	
	Monument addNewMonument(Monument leMonument);
	
	Monument updateMonument(String id, Monument leMonument);
	
	
	void deleteMonument(String id);
	
	
	@RestResource(path="/keyword")
	List<Monument> getByKey(@Param("key") String keyword);
	
	
	/*Celebrite lierNewCelebriteEtMonument(Celebrite celeb);
	
	Lieu addNewLieuMonument(Lieu lieu, ILieuRepository lieuRep);
	
	// Trouver un monument pat son nom
	Monument findMonumentByName(String monumentName);
	
	//Trouver les lieux liés à des monuments
	
	Lieu findMonumentPlacesByLieuName(String lieuName);
	
	//Trouver les acteurs liés à un monument
	
	Celebrite findMonumentCelebByMonumentName(String monumentName);*/
	

}
