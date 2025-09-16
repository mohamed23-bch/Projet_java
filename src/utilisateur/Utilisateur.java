package utilisateur;

public class Utilisateur {
    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;
    private String role;

    public Utilisateur(String nom,String prenom,String adresse,String telephone,String role) {
        this.nom=nom;
        this.prenom=prenom;
        this.adresse=adresse;
        this.telephone=telephone;
        this.role=role;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) { this.nom = nom; }


    public String getPrenom() {return  prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }

    public String getAdresse() {return adresse;}
    public void setAdresse(String adresse) { this.adresse = adresse; }

    public String getTelephone() {return telephone;}
    public void setTelephone(String telephone) { this.telephone = telephone; }

    public String getRole() {return role;}
    public void setRole(String role) { this.role = role; }




}
