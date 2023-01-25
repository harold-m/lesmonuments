package com.projet.Monument.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.data.rest.core.config.Projection;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projet.Monument.Entities.Departement;
import com.projet.Monument.Entities.Monument;
import com.projet.Monument.Services.MonumentImpl;

@RestController
@RequestMapping("/monument")
@CrossOrigin("*")

public class MonumentController {
	
	@Autowired
	private MonumentImpl monumentImpl;
	
	
	@PostMapping("/all/{codeInsee}")
	public Monument create(@PathVariable(name="codeInsee") String codeInsee, @RequestBody Monument leMonument) {
		leMonument.getLieu().setCodeInsee(codeInsee);
		//leMonument.getLieu().setDepartement(departement);
		//leMonument.getLieu().setDep(dept);
		return monumentImpl.addNewMonument(leMonument);
	}
	@PostMapping("/all")
	public Monument createViaAngular(@RequestBody Monument leMonument) {
		// leMonument.getLieu().setCodeInsee(codeInsee);
		//leMonument.getLieu().setDepartement(departement);
		//leMonument.getLieu().setDep(dept);
		return monumentImpl.addNewMonument(leMonument);
	}
	
	@GetMapping("/all")
	public List<Monument> allMonument(){
		return  monumentImpl.findAllMonument();
	}
	
	@DeleteMapping("/all/{id}")
	public String supprimer(@PathVariable(name="id" )String id) {
		 monumentImpl.deleteMonument(id);
		 return "Le monument a été supprimé";
		
	}
	@PutMapping("/all/{id}/{codeInsee}")
	public String mAj(@PathVariable(name="id") String id, @PathVariable(name="codeInsee") String codeInsee, @RequestBody Monument leMonument){
		leMonument.getLieu().setCodeInsee(codeInsee);
		monumentImpl.updateMonument(id, leMonument);
		
		return "Le monument a été mis à jour";
	}
	

		
		
	
		
	

}
