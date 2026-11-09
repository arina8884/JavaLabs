package org.example;

public class Doctor extends Professional {

    private String specialization;

    public Doctor(String name, int experience, double rating, String specialization) {
        super(name, experience, rating);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public void work() {
        System.out.println("врач " + getName() + " (" + specialization + ") лечит пациентов");
    }

    public void diagnose() {
        System.out.println("врач " + getName() + " ставит диагноз пациенту");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" специализация: " + specialization);
    }
}