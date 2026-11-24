package com.youssef.evenements.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youssef.evenements.entities.Evenement;
import com.youssef.evenements.repos.EvenementRepository;

@Service
public class EvenementServiceImpl implements EvenementService {

    @Autowired
    EvenementRepository evenementRepository;

    @Override
    public Evenement saveEvenement(Evenement e) {
        return evenementRepository.save(e);
    }

    @Override
    public Evenement updateEvenement(Evenement e) {
        return evenementRepository.save(e);
    }

    @Override
    public void deleteEvenement(Evenement e) {
        evenementRepository.delete(e);
    }

    @Override
    public void deleteEvenementById(Long id) {
        evenementRepository.deleteById(id);
    }

    @Override
    public Evenement getEvenement(Long id) {
        return evenementRepository.findById(id).get();
    }

    @Override
    public List<Evenement> getAllEvenements() {
        return evenementRepository.findAll();
    }
    
    
    
    @Override
    public List<Evenement> findByLieuIdLieu(Long id) {
        return evenementRepository.findByLieuIdLieu(id);
    }
}