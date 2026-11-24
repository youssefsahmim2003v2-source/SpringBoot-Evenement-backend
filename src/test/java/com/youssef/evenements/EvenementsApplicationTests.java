package com.youssef.evenements;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.youssef.evenements.entities.Lieu;
import com.youssef.evenements.repos.LieuRepository;

@SpringBootTest
class EvenementsApplicationTests {

    @Autowired
    private LieuRepository lieuRepository;

    @Test
    public void testCreateLieu() {
        Lieu loc = new Lieu(null, "Salle Hammamet", null);
        lieuRepository.save(loc);
    }
}