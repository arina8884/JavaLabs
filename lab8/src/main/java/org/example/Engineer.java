package org.example;

public class Engineer extends Professional {
    private String project;

    public Engineer(String name, int experience, double rating, String project) {
        super(name, experience, rating);
        this.project = project;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @Override
    public void work() {
        System.out.println("инженер " + getName() + " проектирует системы для проекта \"" + project + "\".");
    }

    public void design() {
        System.out.println("инженер " + getName() + " разрабатывает чертежи и архитектуру системы");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" проект: " + project);
    }
}