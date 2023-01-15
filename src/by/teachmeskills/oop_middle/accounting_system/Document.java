package by.teachmeskills.oop_middle.accounting_system;

import java.util.Date;

public abstract class Document {
    private String numberDocument;
    private Date dateDocument;

    public Document() {
    }

    public Document(String numberDocument, Date dateDocument) {
        this.numberDocument = numberDocument;
        this.dateDocument = dateDocument;
    }

    public abstract String getInfo();

    public String getNumberDocument() {
        return numberDocument;
    }

    public Date getDateDocument() {
        return dateDocument;
    }
}