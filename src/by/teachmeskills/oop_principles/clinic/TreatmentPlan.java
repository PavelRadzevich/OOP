package by.teachmeskills.oop_principles.clinic;

public class TreatmentPlan {
    private byte treatmentPlanCod;

    public TreatmentPlan() {
    }

    public byte getTreatmentPlanCod() {
        return treatmentPlanCod;
    }

    public void setTreatmentPlanCod(byte treatmentPlanCod) {
        this.treatmentPlanCod = treatmentPlanCod;
        System.out.println("The treatment plan is assigned");
    }
}
