package com.example.demo;

import com.example.demo.Client;
import com.example.demo.Jeu;
import com.example.demo.ClientRepository;
import com.example.demo.JeuRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LudothequeController {

    private final ClientRepository clientRepository;
    private final JeuRepository jeuRepository;

    public LudothequeController(ClientRepository clientRepository, JeuRepository jeuRepository) {
        this.clientRepository = clientRepository;
        this.jeuRepository = jeuRepository;
    }

    @GetMapping("/clients")
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @GetMapping("/jeux")
    public List<Jeu> getAllJeux() {
        return jeuRepository.findAll();
    }
}
