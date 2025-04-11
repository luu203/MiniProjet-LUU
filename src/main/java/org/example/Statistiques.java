package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Statistiques {
    private List<Vol> vols;
    private List<Passager> passagers;
    private Map<String, Integer> destinations;

    public Statistiques(List<Vol> vols, List<Passager> passagers) {
        this.vols = vols;
        this.passagers = passagers;
        this.destinations = new HashMap<>();
        calculerDestinationsPopulaires();
    }

    public void genererRapport() {
        System.out.println("Rapport Statistiques");
        System.out.println("Nombre total de vols : " + vols.size());
        System.out.println("Nombre total de passagers transportés : " + passagers.size());
        System.out.println("Revenus estimés : " + calculerRevenus() + " €");
        afficherDestinationsPopulaires();
    }

    private int calculerRevenus() {
        int tarifMoyen = 500;
        return passagers.size() * tarifMoyen;
    }

    private void calculerDestinationsPopulaires() {
        for (Vol vol : vols) {
            destinations.put(vol.getDestination(), destinations.getOrDefault(vol.getDestination(), 0) + 1);
        }
    }

    private void afficherDestinationsPopulaires() {
        System.out.println("Destinations les plus populaires :");
        destinations.entrySet().stream()
                .sorted((d1, d2) -> d2.getValue().compareTo(d1.getValue()))
                .forEach(d -> System.out.println(d.getKey() + " : " + d.getValue() + " vols"));
    }
}

