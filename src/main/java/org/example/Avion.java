package org.example;

public class Avion {
    private String immatriculation;
    private String modele;
    private int capacite;

    public Avion(String immatriculation, String modele, int capacite) {
        this.immatriculation = immatriculation;
        this.modele = modele;
        this.capacite = capacite;
    }

    public void affecterVol() {
        System.out.println("Avion affecté à un vol.");
    }

    public void verifierDisponibilite() {
        System.out.println("Vérification de la disponibilité de l'avion.");
    }
}

