package by.teachmeskills.oop_principles.clinic;

public class Patient {
    private final TreatmentPlan treatmentPlan;

    public Patient() {
        this.treatmentPlan = new TreatmentPlan();
    }

    public Patient(byte Code) {
        this.treatmentPlan = new TreatmentPlan();
        this.treatmentPlan.setTreatmentPlanCod(Code);
    }

    public void setTreatmentPlan(byte Cod) {
        this.treatmentPlan.setTreatmentPlanCod(Cod);
    }

    public void appointDoctor() {
        switch (this.treatmentPlan.getTreatmentPlanCod()) {
            case 1:
                Doctor regularDoctor = new Surgeon();
                regularDoctor.treat();
                break;
            case 2:
                regularDoctor = new Dentist();
                regularDoctor.treat();
                break;
            default:
                regularDoctor = new Therapist();
                regularDoctor.treat();
        }
    }
}
