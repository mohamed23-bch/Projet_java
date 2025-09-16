package intervention;

import java.util.Date;

public class Intervention {

    private Date date;
    private String description;
    private Float cout;
    private String status;

    public Intervention(Date date, String description, Float cout, String status) {
        this.date = date;
        this.description = description;
        this.cout = cout;
        this.status = status;
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

    @Override
    public String toString() {
        return "Intervention{" + "date=" + date + ", description=" + description + ", cout=" + cout;
    }

}