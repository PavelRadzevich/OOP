package by.teachmeskills.oop_simple.computer;

public class Hdd {
    private String name;
    private int memory;
    private type driveType;

    public enum type {internal, external}

    public Hdd() {
    }

    public Hdd(String name, int memory, type driveType) {
        this.name = name;
        this.memory = memory;
        this.driveType = driveType;
    }

    @Override
    public String toString() {
        return "Hdd{" +
                "name='" + name + '\'' +
                ", memory=" + memory +
                ", driveType=" + driveType +
                '}';
    }
}