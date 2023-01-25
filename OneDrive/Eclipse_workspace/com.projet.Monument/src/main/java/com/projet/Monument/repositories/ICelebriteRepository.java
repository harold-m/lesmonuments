package com.projet.Monument.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.projet.Monument.Entities.Celebrite;

@Repository
@RepositoryRestResource
@CrossOrigin(origins="*")
public interface ICelebriteRepository extends JpaRepository<Celebrite, Long> {

}
