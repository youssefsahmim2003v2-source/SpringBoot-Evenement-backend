package com.youssef.evenements.service;

import java.util.List;

import com.youssef.evenements.entities.Evenement;

public interface EvenementService {
    Evenement saveEvenement(Evenement e);
    Evenement updateEvenement(Evenement e);
    void deleteEvenement(Evenement e);
    void deleteEvenementById(Long id);
    Evenement getEvenement(Long id);
    List<Evenement> getAllEvenements();
    
    
    
    List<Evenement> findByLieuIdLieu(Long id);
    
    
    
    
}