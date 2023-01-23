package by.teachmeskills.oop_principles.clinic;

public abstract class Doctor {
    private Doctors name;

    void treat() {
    }

    public void setName(Doctors name) {
        this.name = name;
    }

    public Doctors getName() {
        return name;
    }
}
