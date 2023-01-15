package by.teachmeskills.oop_principles.clinic;

public class TreatmentPlan {
    private byte TreatmentPlanCod;

    public TreatmentPlan() {
    }

    public byte getTreatmentPlanCod() {
        return TreatmentPlanCod;
    }

    public void setTreatmentPlanCod(byte treatmentPlanCod) {
        TreatmentPlanCod = treatmentPlanCod;
        System.out.println("The treatment plan is assigned");
    }
}
