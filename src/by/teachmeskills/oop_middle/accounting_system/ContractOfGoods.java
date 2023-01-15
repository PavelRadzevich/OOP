package by.teachmeskills.oop_middle.accounting_system;

import java.util.Date;

public class ContractOfGoods extends Document {
    private Long quantityOfGoods;
    private String typeOfGoods;

    public ContractOfGoods() {
        super();
    }

    public ContractOfGoods(String numberDocument, Date dateDocument, Long quantityOfGoods, String typeOfGoods) {
        super(numberDocument, dateDocument);
        this.quantityOfGoods = quantityOfGoods;
        this.typeOfGoods = typeOfGoods;

    }
}
