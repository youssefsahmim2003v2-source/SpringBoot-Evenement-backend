package com.youssef.evenements.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.youssef.evenements.entities.Evenement;
import com.youssef.evenements.service.EvenementService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class EvenementRESTController {

    @Autowired
    EvenementService evenementService;

    @GetMapping
    public List<Evenement> getAllEvenements() {
        return evenementService.getAllEvenements();
    }

    @GetMapping("/{id}")
    public Evenement getEvenementById(@PathVariable("id") Long id) {
        return evenementService.getEvenement(id);
    }

    @PostMapping
    public Evenement createEvenement(@RequestBody Evenement evenement) {
        return evenementService.saveEvenement(evenement);
    }

    @PutMapping
    public Evenement updateEvenement(@RequestBody Evenement evenement) {
        return evenementService.updateEvenement(evenement);
    }

    @DeleteMapping("/{id}")
    public void deleteEvenement(@PathVariable("id") Long id) {
        evenementService.deleteEvenementById(id);
    }
    
    @GetMapping("/evenlieu/{idLieu}")
    public List<Evenement> getEvenementsByLieuId(@PathVariable("idLieu") Long idLieu) {
        return evenementService.findByLieuIdLieu(idLieu);
    }
}