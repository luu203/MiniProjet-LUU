package org.example;

public class Passager extends Personne {
    private String passeport;

    public Passager(int identifiant, String nom, String adresse, String contact, String passeport) {
        super(identifiant, nom, adresse, contact);
        this.passeport = passeport;
    }

    public void reserverVol() {
        System.out.println("Réservation d'un vol effectuée.");
    }

    public void annulerReservation() {
        System.out.println("Réservation annulée.");
    }

    public void obtenirReservations() {
        System.out.println("Obtention des réservations du passager.");
    }
}

