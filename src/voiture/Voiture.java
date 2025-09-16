package voiture;

public class Voiture {
    private String immatricule;
    private String marque;
    private String modele;
    private int annee;

    public Voiture(String immatricule, String marque, String modele, int annee) {
        this.immatricule = immatricule;
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
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
}
