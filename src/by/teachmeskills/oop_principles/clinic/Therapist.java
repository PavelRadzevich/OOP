package by.teachmeskills.oop_principles.clinic;

public class Therapist extends Doctor implements Treatment {

    public Therapist() {
        this.setName(Doctors.THERAPIST);
    }

    @Override
    public void treat() {
        System.out.println("The " + this.getName() + " began treatment");
    }
}
