package by.teachmeskills.oop_middle.accounting_system;

import java.util.Date;

public class EmploymentContract extends Document {

    private Date expirationDate;
    private String employeeName;

    public EmploymentContract() {
    }

    public EmploymentContract(String numberDocument, Date dateDocument, Date expirationDate, String employeeName) {
        super(numberDocument, dateDocument);
        this.expirationDate = expirationDate;
        this.employeeName = employeeName;
    }

    @Override
    public String getInfo() {
        return "Contract: " + getNumberDocument() + " Date: " + getDateDocument() + " Expiration of Date: " + expirationDate + " Employee Name: " + employeeName;
    }
}