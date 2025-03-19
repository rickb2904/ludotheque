package com.example.demo;

import com.example.demo.ClientRepository;
import com.example.demo.JeuRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final ClientRepository clientRepository;
    private final JeuRepository jeuRepository;

    public DataInitializer(ClientRepository clientRepository, JeuRepository jeuRepository) {
        this.clientRepository = clientRepository;
        this.jeuRepository = jeuRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Client client = new Client();
        client.setNom("Dupont");
        client.setPrenom("Jean");
        client.setEmail("jean.dupont@example.com");
        client.setNoTelephone("0102030405");
        clientRepository.save(client);

        Jeu jeu = new Jeu();
        jeu.setTitre("Catan");
        jeu.setReference("REFCATAN001");
        jeu.setAgeMin(10);
        jeu.setDescription("Un jeu de commerce et de colonisation");
        jeu.setDuree(60);
        jeu.setTarifJour(2.50);
        jeuRepository.save(jeu);

        System.out.println("=== Données de test insérées dans la base ===");
    }
}
