package utilisateur;

public class Mecanicien extends Utilisateur {
    private String ref;

    public String getRef() {return ref;}
    public void setRef(String ref) { this.ref = ref; }


    public Mecanicien(String nom, String prenom, String adresse, String telephone, String ref) {
        super(nom, prenom, adresse, telephone);
        this.ref = ref;
    }

}
