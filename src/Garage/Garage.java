package Garage;

import utilisateur.Mecanicien;
import voiture.Voiture;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private String nom;
    private String adresse;
    private int telephone;
    private List<Voiture> voiture ;
    private List<Mecanicien> mecanicien;

    public String getNom() {return this.nom;}
    public void setNom(String nom) {this.nom = nom;}

    public String getAdresse() {return this.adresse;}
    public void setAdresse(String adresse) {this.adresse = adresse;}

    public int getTelephone() {return this.telephone;}
    public void setTelephone(int telephone) {this.telephone = telephone;}

    public List<Voiture> getVoiture() {return this.voiture;}

    public void setVoiture(List<Voiture> voiture) {
        this.voiture = voiture;
    }

    public List<Mecanicien> getMecanicien() {return this.mecanicien;}
    public void setMecanicien(List<Mecanicien> mecanicien) {this.mecanicien = mecanicien;}

    public Garage(String nom, String adresse, int telephone) {
        this.nom = nom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.voiture = new ArrayList<Voiture>();
        this.mecanicien = new ArrayList<Mecanicien>();
    }

}
