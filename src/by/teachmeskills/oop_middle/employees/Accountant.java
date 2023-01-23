package by.teachmeskills.oop_middle.employees;

public class Accountant extends Person implements Employees {
    private final Positions position;

    public Accountant(String name) {
        super(name);
        this.position = Positions.ACCOUNTANT;
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
