package voiture;

public class Voiture {
    private String immatricule;
    private String marque;
    private String modele;
    private int annee;
    private String statut;
    private String prix;

    public Voiture(String immatricule, String marque, String modele, int annee, String statut, String prix) {
        this.immatricule = immatricule;
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
        this.statut = statut;
        this.prix = prix;
    }
    public String getImmatricule() {
        return immatricule;
    }
    public void setImmatricule(String immatricule) {
        this.immatricule = immatricule;
    }

    public String getMarque() {return this.marque;}
    public void setMarque(String marque) {this.marque = marque;}

    public String getModele() {return this.modele;}
    public void setModele(String modele) {this.modele = modele;}

    public int getAnnee() {return this.annee;}
    public void setAnnee(int annee) {this.annee = annee;}

    public String getStatut() {return this.statut;}
    public void setStatut(String statut) {this.statut = statut;}

    public String getPrix() {return this.prix;}
    public void setPrix(String prix) {this.prix = prix;}
}
