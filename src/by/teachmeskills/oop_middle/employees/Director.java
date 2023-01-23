package by.teachmeskills.oop_middle.employees;

public class Director extends Person implements Employees {
    private final Positions position;

    public Director(String name) {
        super(name);
        this.position = Positions.DIRECTOR;
    }

    @Override
    public void printEmployeePosition() {
        System.out.println("Job title of " + this.getName() + " is: " + position.name());
    }

    @Override
    public String toString() {
        return "{" + position + "; " + getName() + '}';
    }
}
