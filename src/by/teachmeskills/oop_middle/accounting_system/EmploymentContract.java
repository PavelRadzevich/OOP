package by.teachmeskills.oop_middle.accounting_system;

import java.util.Date;

public class EmploymentContract extends Document {

    private Date expirationDate;
    private String employeeName;

    public EmploymentContract() {
    }

    public EmploymentContract(String numberDocument, Date dateDocument,Date expirationDate, String employeeName) {
        super(numberDocument, dateDocument);
        this.expirationDate = expirationDate;
        this.employeeName = employeeName;
    }
}