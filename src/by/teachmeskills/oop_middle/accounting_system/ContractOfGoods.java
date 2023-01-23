package by.teachmeskills.oop_middle.accounting_system;

import java.util.Date;

public class ContractOfGoods extends Document {
    private int quantityOfGoods;
    private String typeOfGoods;

    public ContractOfGoods() {

    }

    public ContractOfGoods(String numberDocument, Date dateDocument, int quantityOfGoods, String typeOfGoods) {
        super(numberDocument, dateDocument);
        this.quantityOfGoods = quantityOfGoods;
        this.typeOfGoods = typeOfGoods;

    }

    @Override
    public String getInfo() {
        return "Contract: " + getNumberDocument() + " Date: " + getDateDocument() + " Quality of Goods: " + quantityOfGoods + " Type of Goods" + typeOfGoods;
    }
}
