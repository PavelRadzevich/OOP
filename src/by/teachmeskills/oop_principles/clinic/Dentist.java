package by.teachmeskills.oop_principles.clinic;

public class Dentist extends Doctor implements Treatment {
    public Dentist() {
        this.setName(Doctors.DENTIST);
    }

    @Override
    public void treat() {
        System.out.println("The " + this.getName() + " began treatment");
    }
}
