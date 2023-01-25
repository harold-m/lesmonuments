package com.projet.Monument.Services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//import org.springframework.beans.factory.annotation.Autowired;

import com.projet.Monument.Entities.Monument;
import com.projet.Monument.repositories.ImonumentRepository;

@Service
@Component
public class MonumentImpl implements IMonumentService{
	
	@Autowired
	private ImonumentRepository monumentRep;
	
	
	@Override
	public List<Monument> findAllMonument(){
		return monumentRep.findAll();
	}
	
	
	@Override
	public Monument findById(String id){
		return monumentRep.findById(id).get();
		
	}
	
	@Override
	public Monument addNewMonument(Monument leMonument) {
		
		return monumentRep.save(leMonument);
		
		//Attributs initiales
	/*	leMonument.setCodeM("spfb05ty554b");
		leMonument.setNom("HOTEL DUFFAU");
		leMonument.setProprietaire("PRIVE");
		leMonument.setTypeMonument("HOTEL_PARTICULIER");
		leMonument.setLongitude(3.87521667);
		leMonument.setLatitude(43.6140222);
		
		Lieu lieu = new Lieu("34172","MONTPELLIER",3.876716,43.610769);
		
		Departement departement = new Departement("34", "Herault", lieu, "Occitanie");

		leMonument.setLieu(lieu);
		
		Celebrite celeb = new Celebrite(1,"Moulin","Jean","Francaise","XX");
		
		List<Celebrite> celebListe = new ArrayList<>();
		celebListe.add(celeb);
		
		leMonument.setCeleb(celebListe);
		//System.out.println("Le monument a été ajouté");*/

		
	}

	@Override
	public void deleteMonument(String id) {
		monumentRep.deleteById(id);
		
	}


	@Override
	public Monument updateMonument(@PathVariable(name="id") String id, Monument leMonument) {
		// TODO Auto-generated method stub
		return monumentRep.save(leMonument);
	}
	//private ImonumentRepository monumentRep;


	@Override
	public List<Monument> getByKey(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/*private ILieuRepository lieuRep;
	private ICelebriteRepository celebRep;
	private IDepartementRepository departementRep;*/
	
	
/*
	@Override
	//@GetMapping("/monuments")
	public Monument addNewMonument(Monument leMonument, ImonumentRepository monumentRep) {		
		// TODO Auto-generated method stub
		//monument.setCodeM(UUID.randomUUID().toString());
		
		List<Monument> listeMonuments = new ArrayList<>();
		//Attributs initiales
		leMonument.setCodeM(UUID.randomUUID().toString());
		leMonument.setNom("Arc de Triomphe");
		leMonument.setProprietaire("France");
		leMonument.setTypeMonument("Historique : symbolisant puissance de la royauté");
		leMonument.setLatitude(0);
		leMonument.setLongitude(0);
		//Attributs concernant les celebrité liées au monument
		Celebrite celeb1= new Celebrite( UUID.randomUUID().hashCode(), "D'Aviler", "Augustin-Charles", "Française", "1691");
		Celebrite celeb2 = new Celebrite( UUID.randomUUID().hashCode(), "Louis", "XIV", "Française", "1638");
		List<Celebrite> celeb = new ArrayList<>();
		celeb.add(celeb1);
		celeb.add(celeb2);
	    leMonument.setCeleb(celeb);
		//Attributs liées au lieu
	    
	    List<Lieu> listLieu = new ArrayList<>();
	    
	  Lieu lieu1 = new Lieu("34000", "Herault", "Montpellier", 43.610769, 3.876716 );
	  Lieu lieu2= new Lieu("34172", "Herault", "Sete", 43.4079, 3.7008);
	//  Lieu lieu3= new Lieu("34100", "Herault", "Lodeve", 43.4079, 3.7008);
	  
	//  listLieu.add(lieu3);
	  listLieu.add(lieu2);
	  listLieu.add(lieu1);
	  
	  //pour ajouter un monument dans les attributs d'un monument
	  listeMonuments.add(leMonument);
	  lieu1.setMonuments(listeMonuments);
	  lieu1.setDepartement_lieu(new Departement("34", "Herault","MONTPELLIER",  "Occitanie", listLieu, lieu1));
	  lieu1.setDepartement(new Departement("34", "Herault","MONTPELLIER CEDEX",  "Occitanie", listLieu, lieu2));
	    
	    leMonument.setLieu(lieu1);

		 return monumentRep.save(leMonument);
		//return monumentRep.save(monument);
	}

	@Override
	public Celebrite lierNewCelebriteEtMonument(Celebrite celeb) {
		// TODO Auto-generated method stub
		
		return null;
		
	}

	@Override
	public Lieu addNewLieuMonument(Lieu lieu, ILieuRepository lieuRep) {
		// TODO Auto-generated method stub
		// attributs initiales de Lieu
		
		lieu.setCodeInsee("34712");
		lieu.setDep("34");
		lieu.setLatitude(3.876716);
		lieu.setLongitude(43.610769);
		lieu.setNomCom("MONTPELLIER");
		
		//Attributs par rapport au monument
		
		return lieuRep.save(null);
	}

	@Override
	public Monument findMonumentByName(String monumentName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Lieu findMonumentPlacesByLieuName(String lieuName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Celebrite findMonumentCelebByMonumentName(String monumentName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@GetMapping()
	public Monument findAllM() {
		// TODO Auto-generated method stub
		return null;
	}*/

	
	
	

}
