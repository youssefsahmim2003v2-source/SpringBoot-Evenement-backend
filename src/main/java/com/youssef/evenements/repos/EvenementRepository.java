package com.youssef.evenements.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.youssef.evenements.entities.Evenement;

public interface EvenementRepository extends JpaRepository<Evenement, Long> {
	List<Evenement> findByLieuIdLieu(Long id);
}