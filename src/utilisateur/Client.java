package utilisateur;

import voiture.Voiture;

public class Client extends Utilisateur {
    private int numClient;
    Voiture voiture;


    public void setNumClient(int numClient) {this.numClient = numClient;}
    public int getNumClient() {return numClient;}

    public Client(String nom,String prenom,String adresse,String telephone,int numClient,Voiture voiture) {
        super(nom,prenom,adresse,telephone);
        this.numClient = numClient;
        this.voiture = voiture;
    }
}
