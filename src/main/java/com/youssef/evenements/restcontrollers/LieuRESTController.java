/*package com.youssef.evenements.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.youssef.evenements.entities.Lieu;
import com.youssef.evenements.repos.LieuRepository;

@RestController
@RequestMapping("/lieux")
@CrossOrigin
public class LieuRESTController {

    @Autowired
    LieuRepository lieuRepository;

    @GetMapping
    public List<Lieu> getAllLieux() {
        return lieuRepository.findAll();
    }
}*/