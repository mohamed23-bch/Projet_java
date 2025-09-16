package utilisateur;

import intervention.Intervention;

import java.util.ArrayList;
import java.util.List;

public class Mecanicien extends Utilisateur {
    private String ref;
    private List<Intervention> interventions;

    public void setInterventions(List<Intervention> interventions) {this.interventions = interventions;}
    public List<Intervention> getInterventions() {return this.interventions;}

    public String getRef() {return ref;}
    public void setRef(String ref) { this.ref = ref; }


    public Mecanicien(String nom, String prenom, String adresse, String telephone, String ref) {
        super(nom, prenom, adresse, telephone);
        this.ref = ref;
        this.interventions = new ArrayList<>();
    }

}
