package by.teachmeskills.oop_middle.accounting_system;

import java.util.Date;

public class Invoice extends Document {
    public double monthlyTotal;
    public int departmentCode;

    public Invoice() {
    }

    public Invoice(String numberDocument, Date dateDocument, double monthlyTotal, int departmentCode) {
        super(numberDocument, dateDocument);
        this.monthlyTotal = monthlyTotal;
        this.departmentCode = departmentCode;
    }

    @Override
    public String getInfo() {
        return "Invoice: " + getNumberDocument() + " Date: " + getDateDocument() + " Monthly Total: " + monthlyTotal + " Department: " + departmentCode;
    }
}