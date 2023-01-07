package by.teachmeskills.oop_simple.computer;

public class Ram {
    private String name;
    private int memory;

    public Ram() {
    }

    public Ram(String name, int memory) {
        this.name = name;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "name='" + name + '\'' +
                ", memory=" + memory +
                '}';
    }
}