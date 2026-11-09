package org.example;

public class Teacher implements Workable, Teachable {
    private String name;
    private int experience;
    private String subject;

    public Teacher(String name, int experience, String subject) {
        this.name = name;
        this.experience = experience;
        this.subject = subject;
    }

    public String getName() { return name; }
    public String getSubject() { return subject; }

    @Override
    public void work() {
        System.out.println("учитель " + name + " проверяет тетради и готовит план урока по предмету: " + subject);
    }

    @Override
    public int getExperience() {
        return experience;
    }

    @Override
    public void teach() {
        System.out.println("учитель " + name + " ведёт урок по предмету " + subject + ".");
    }

    @Override
    public int getStudents() {
        return 25;
    }

    public void displayInfo() {
        System.out.println("учитель: " + name + " | предмет: " + subject + " | стаж: " + experience + " лет");
    }
}