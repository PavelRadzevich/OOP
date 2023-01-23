package by.teachmeskills.oop_middle.employees;

public class Worker extends Person implements Employees {
    private final Positions position;

    public Worker(String name) {
        super(name);
        this.position = Positions.WORKER;
    }

    @Override
    public void printEmployeePosition() {
        System.out.println("Job title of " + this.getName() + " is: " + this.position.name());
    }

    @Override
    public String toString() {
        return "{" + position + "; " + getName() + '}';
    }
}
