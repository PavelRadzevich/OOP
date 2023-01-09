package by.teachmeskills.oop_simple.atm_machine;

public class AtmMachine {
    private int nominalATM20;
    private int nominalATM50;
    private int nominalATM100;
    private final int NOMINAL20 = 20;
    private final int NOMINAL50 = 50;
    private final int NOMINAL100 = 100;

    public AtmMachine() {
        this.nominalATM20 = 0;
        this.nominalATM50 = 0;
        this.nominalATM100 = 0;
    }

    public AtmMachine(int nominalATM20, int nominalATM50, int nominalATM100) {
        this.nominalATM20 = nominalATM20;
        this.nominalATM50 = nominalATM50;
        this.nominalATM100 = nominalATM100;
    }

    public void addBills(int nominal20, int nominal50, int nominal100) {
        this.nominalATM20 += nominal20;
        this.nominalATM50 += nominal50;
        this.nominalATM100 += nominal100;

    }

    public boolean cashWithdrawal(int cash) {
        boolean ret = false;

        int cashATM = this.nominalATM20 * NOMINAL20 + this.nominalATM50 * NOMINAL50 + this.nominalATM100 * NOMINAL100;
        int[] nom = new int[]{NOMINAL100, NOMINAL50, NOMINAL20};
        int[] nomCounter = new int[nom.length];
        if (cashATM >= cash) {
            for (int i = 0; i < nom.length; i++) {
                int temp = cash / nom[i];
                if (temp <= this.nominalATM100 && i == 0) {
                    cash = cash - temp * nom[i];
                    this.nominalATM100 = this.nominalATM100 - temp;
                    nomCounter[i] = temp;
                }
                if (temp <= this.nominalATM50 && i == 1) {
                    cash = cash - temp * nom[i];
                    this.nominalATM50 = this.nominalATM50 - temp;
                    nomCounter[i] = temp;
                }
                if (temp <= this.nominalATM20 && i == 2) {
                    cash = cash - temp * nom[i];
                    this.nominalATM20 = this.nominalATM20 - temp;
                    nomCounter[i] = temp;
                }
            }
            ret = true;
            System.out.println("Cash withdrawn ");
            for (int i = 0; i < nom.length; i++) {
                if (nomCounter[i] != 0) {
                    System.out.println(nom[i] + " : " + nomCounter[i]);
                }
            }
        }
        return ret;
    }

    @Override
    public String toString() {
        return "ATM Currency Count \n" + NOMINAL20 + "$ : " + nominalATM20 +
                " |  " + NOMINAL50 + "$ : " + nominalATM50 +
                " |  " + NOMINAL100 + "$ : " + nominalATM100;
    }
}
