package com.youssef.evenements.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.youssef.evenements.entities.Lieu;

@RepositoryRestResource(path = "lieux", collectionResourceRel = "lieux")
@CrossOrigin(origins = "http://localhost:4200/")
public interface LieuRepository extends JpaRepository<Lieu, Long> {
}
