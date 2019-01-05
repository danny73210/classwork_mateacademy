package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;

public class Main {
    private static EntityManagerFactory factory = Persistence
            .createEntityManagerFactory("PatientPU");
    private static EntityManager manager;
    public static void main(String[] args) {
        try {
            create("Name", "LastName", new Date());
            createSuper("SuperName", "SuperLastName", new Date(), "SuperPower", "SuperDrugs");
           /* System.out.println(findPatient(3));
            updatePatientLastName(3, "Marly");
            deletePatient(1);*/
        } finally {
            factory.close();
        }
    }

    public static void create(String name, String lastName, Date dateOfBirth) {
        manager = factory.createEntityManager();
        //откат
        manager.getTransaction().begin();
        Patient patient = new Patient(name, lastName, dateOfBirth);
        Analyse analyse = new Analyse(patient);
        patient.getAnalyses().add(analyse);
        //конвертация
        manager.persist(patient);
        manager.persist(analyse);
        //отправка данных
        manager.flush();
        manager.getTransaction().commit();
        manager.close();
    }

    public static void createSuper(String name, String lastName, Date dateOfBirth, String power, String drugs) {
        manager = factory.createEntityManager();
        manager.getTransaction().begin();
        SuperPatient superpatient = new SuperPatient(name, lastName, dateOfBirth, power, drugs);
        manager.persist(superpatient);
        manager.flush();
        manager.getTransaction().commit();
        manager.close();
    }

    public static Patient findPatient(int id) {
        manager = factory.createEntityManager();
        manager.getTransaction().begin();
        Patient patient = manager.find(Patient.class, id);
        manager.getTransaction().commit();
        manager.close();
        return patient;
    }

    public static void updatePatientLastName(int id, String lastName) {
        manager = factory.createEntityManager();
        manager.getTransaction().begin();
        Patient patient = manager.find(Patient.class, id);
        System.out.print(patient.getLastName());
        patient.setLastName(lastName);
        System.out.println(" - " + patient.getLastName());
        manager.getTransaction().commit();
        manager.close();
    }

    public static void deletePatient(int id) {
        manager = factory.createEntityManager();
        manager.getTransaction().begin();
        Patient patient = manager.find(Patient.class, id);
        manager.remove(patient);
        manager.getTransaction().commit();
        manager.close();
    }
}