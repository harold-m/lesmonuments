package com.projet.Monument.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.projet.Monument.Entities.Monument;

@Repository
@RepositoryRestResource
@CrossOrigin(origins="*")
public interface ImonumentRepository extends JpaRepository<Monument, String> {

}

