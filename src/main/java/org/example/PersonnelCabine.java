package org.example;

public class PersonnelCabine extends Employe {
    private String qualification;

    public PersonnelCabine(int identifiant, String nom, String adresse, String contact, int numeroEmploye, String dateEmbauche, String qualification) {
        super(identifiant, nom, adresse, contact, numeroEmploye, dateEmbauche);
        this.qualification = qualification;
    }

    public void affecterVol() {
        System.out.println("Personnel de cabine affecté à un vol.");
    }

    public void obtenirVol() {
        System.out.println("Obtention des informations du vol pour le personnel de cabine.");
    }
}

