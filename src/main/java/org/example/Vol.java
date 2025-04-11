package org.example;

public class Vol {
    private int numeroVol;
    private String origine;
    private String destination;
    private String dateHeureDepart;
    private String dateHeureArrivee;
    private String etat;

    public Vol(int numeroVol, String origine, String destination, String dateHeureDepart, String dateHeureArrivee, String etat) {
        this.numeroVol = numeroVol;
        this.origine = origine;
        this.destination = destination;
        this.dateHeureDepart = dateHeureDepart;
        this.dateHeureArrivee = dateHeureArrivee;
        this.etat = etat;
    }

    public void planifierVol() {
        System.out.println("Vol planifié.");
    }

    public void annulerVol() {
        System.out.println("Vol annulé.");
    }

    public void modifierVol() {
        System.out.println("Modification des détails du vol.");
    }

    public void listingPassager() {
        System.out.println("Liste des passagers pour ce vol.");
    }

    public String getDestination() {
        return destination;
    }
}

