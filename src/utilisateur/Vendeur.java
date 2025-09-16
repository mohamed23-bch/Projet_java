package utilisateur;

public class Vendeur extends Utilisateur {
    private int numVendeur;

    public void setNumVendeur(int numVendeur) {this.numVendeur = numVendeur;}
    public int getNumVendeur() {return this.numVendeur;}

    public Vendeur(String nom,String prenom,String adresse,String telephone,int numVendeur) {
        super(nom,prenom,adresse,telephone);
        this.numVendeur = numVendeur;
    }

}
