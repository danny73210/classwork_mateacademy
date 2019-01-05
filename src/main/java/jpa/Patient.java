package jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "patients")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "patient_id")
    private int id;
    @Column(name = "patient_name")
    private String name;
    @Column(name = "patient_last_name")
    private String lastName;
    @Column(name = "patient_date_of_birth")
    private Date dateOfBirth;
    @OneToMany(mappedBy = "patient")
    Set<Analyse> analyses = new HashSet<>();

    public Patient(String name, String lastName, Date dateOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public Patient() {
    }

    public Set<Analyse> getAnalyses() {
        return analyses;
    }

    public void setAnalyses(Set<Analyse> analyses) {
        this.analyses = analyses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "jpa.Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
