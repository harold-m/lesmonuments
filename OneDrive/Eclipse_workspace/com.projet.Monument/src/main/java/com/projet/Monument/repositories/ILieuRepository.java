package com.projet.Monument.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.projet.Monument.Entities.Lieu;

@Repository
@RepositoryRestResource
@CrossOrigin(origins="*")
public interface ILieuRepository extends JpaRepository<Lieu, Long> {

}
