package intervention;

import utilisateur.Mecanicien;
import voiture.Voiture;

import java.util.Date;

public class Intervention {

    private Date date;
    private String description;
    private Float cout;
    private String status;
    private Voiture voiture;
    private Mecanicien  mecanicien;

    public Intervention(Date date, String description, Float cout, String status,Voiture voiture,Mecanicien mecanicien) {
        this.date = date;
        this.description = description;
        this.cout = cout;
        this.status = status;
        this.voiture = voiture;
        this.mecanicien = mecanicien;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}

    public Float getCout() {return cout;}
    public void setCout(Float cout) {this.cout = cout;}

    public String getStatus() {return status;}
    public void setStatus(String status) {this.status = status;}

    public Voiture getVoiture() {return voiture;}
    public void setVoiture(Voiture voiture) {this.voiture = voiture; }

    public Mecanicien getMecanicien() {return mecanicien;}
    public void setMecanicien(Mecanicien mecanicien) {this.mecanicien = mecanicien; }

    @Override
    public String toString() {
        return "Intervention{" + "date=" + date + ", description=" + description + ", cout=" + cout;
    }

}