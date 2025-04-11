package org.example;

public class Pilote extends Employe {
    private String licence;
    private int heuresDeVol;

    public Pilote(int identifiant, String nom, String adresse, String contact, int numeroEmploye, String dateEmbauche, String licence, int heuresDeVol) {
        super(identifiant, nom, adresse, contact, numeroEmploye, dateEmbauche);
        this.licence = licence;
        this.heuresDeVol = heuresDeVol;
    }

    public void affecterVol() {
        System.out.println("Pilote affecté à un vol.");
    }

    public void obtenirVol() {
        System.out.println("Obtention des informations du vol pour le pilote.");
    }
}

