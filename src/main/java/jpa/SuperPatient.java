package jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table (name = "super_patients")
public class SuperPatient extends Patient {
    @Column
    private String power;
    @Column
    private String drugs;

    public SuperPatient(String name, String lastName, Date dateOfBirth, String power, String drugs) {
        super(name, lastName, dateOfBirth);
        this.power = power;
        this.drugs = drugs;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getDrugs() {
        return drugs;
    }

    public void setDrugs(String drugs) {
        this.drugs = drugs;
    }
}
