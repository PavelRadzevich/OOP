package by.teachmeskills.oop_principles.clinic;

public class Surgeon extends Doctor implements Treatment {

    public Surgeon() {
        this.setName(Doctors.SURGEON);
    }

    @Override
    public void treat() {
        System.out.println("The " + this.getName() + " began treatment");
    }
}
