package Garage;

import utilisateur.Mecanicien;
import voiture.Voiture;

public class Garage {
    private String nom;
    private String adresse;
    private int telephone;
    Voiture voiture;
    Mecanicien mecanicien;

    public String getNom() {return this.nom;}
    public void setNom(String nom) {this.nom = nom;}

    public String getAdresse() {return this.adresse;}
    public void setAdresse(String adresse) {this.adresse = adresse;}

    public int getTelephone() {return this.telephone;}
    public void setTelephone(int telephone) {this.telephone = telephone;}

    public Garage(String nom, String adresse, int telephone, Voiture voiture, Mecanicien mecanicien) {
        this.nom = nom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.voiture = voiture;
        this.mecanicien = mecanicien;
    }

}
