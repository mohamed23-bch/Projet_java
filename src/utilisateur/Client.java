package utilisateur;

import voiture.Voiture;

import java.util.ArrayList;
import java.util.List;

public class Client extends Utilisateur {
    private int numClient;
    private List<Voiture> voitures;


    public void setNumClient(int numClient) {this.numClient = numClient;}
    public int getNumClient() {return numClient;}

    public List<Voiture> getVoitures() {
        return voitures;
    }
    public void setVoitures(List<Voiture> voitures) {this.voitures = voitures;}


    public Client(String nom, String prenom, String adresse, String telephone, int numClient) {
        super(nom,prenom,adresse,telephone);
        this.numClient = numClient;
        this.voitures = new ArrayList<Voiture>();
    }
}
