package by.teachmeskills.oop_middle.accounting_system;

import java.util.Date;

public class Invoice extends Document {
    public double monthlyTotal;
    public int departmentCode;

    public Invoice() {
    }

    public Invoice(String numberDocument, Date dateDocument) {
        super(numberDocument, dateDocument);
    }
}