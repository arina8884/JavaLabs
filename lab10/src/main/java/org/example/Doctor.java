package org.example;

public class Doctor implements Workable, Teachable {
    private String name;
    private int experience;
    private String specialization;

    public Doctor(String name, int experience, String specialization) {
        this.name = name;
        this.experience = experience;
        this.specialization = specialization;
    }

    public String getName() { return name; }
    public String getSpecialization() { return specialization; }

    @Override
    public void work() {
        System.out.println("врач " + name + " (" + specialization + ") лечит пациентов");
    }

    @Override
    public int getExperience() {
        return experience;
    }

    @Override
    public void teach() {
        System.out.println("врач " + name + " проводит мастер-класс для интернов.");
    }

    @Override
    public int getStudents() {
        return 3;
    }

    public void displayInfo() {
        System.out.println("доктор: " + name + " | специализация: " + specialization + " | стаж: " + experience + " лет");
    }
}