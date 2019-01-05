package jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "jpa.Analyse" )
public class Analyse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "analyse_id")
    private int id;
    @ManyToOne
    @JoinColumn(name="patient_id", nullable=false)
    private Patient patient;

    public Analyse(Patient patient) {
        this.patient = patient;
    }

    public Analyse() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "jpa.Analyse{" +
                "id=" + id +
                '}';
    }
}