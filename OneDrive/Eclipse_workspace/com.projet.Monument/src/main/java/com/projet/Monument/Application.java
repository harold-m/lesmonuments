package com.projet.Monument;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

//import java.util.ArrayList;
//import java.util.List;
//import java.util.UUID;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.hateoas.config.EnableHypermediaSupport;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.projet.Monument.Entities.Celebrite;
import com.projet.Monument.Entities.Departement;
import com.projet.Monument.Entities.Lieu;
//import com.projet.Monument.Entities.Celebrite;
//import com.projet.Monument.Entities.Departement;
//import com.projet.Monument.Entities.Lieu;
import com.projet.Monument.Entities.Monument;
//import com.projet.Monument.repositories.*;
import com.projet.Monument.Services.*;
import com.projet.Monument.repositories.ImonumentRepository;


@Configuration
@SpringBootApplication
public class Application implements CommandLineRunner{

	
	@Autowired
	private RepositoryRestConfiguration restConfig;


	public static void main(String[] args){
		SpringApplication.run(Application.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		restConfig.exposeIdsFor(Monument.class);
		
	}

	
	
}
