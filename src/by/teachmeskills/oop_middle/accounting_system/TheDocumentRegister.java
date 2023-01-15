package by.teachmeskills.oop_middle.accounting_system;

public class TheDocumentRegister {
    private final Document[] register;
    private static final int REGISTER_SIZE = 10;
    private int indexRegister = 0;

    public TheDocumentRegister() {
        this.register = new Document[REGISTER_SIZE];
    }

    public void saveDocument(Document doc) {
        if (indexRegister < REGISTER_SIZE) {
            register[indexRegister++] = doc;
        } else System.out.println("Register is Full!");
    }

    public void getDocument(String numberDocument) {
        for (Document document : register) {
            if (document.getNumberDocument().equals(numberDocument)) {
                System.out.println(document.getInfo());
                return;
            }
        }
        System.out.println("There is no such document in the register.");
    }
}
