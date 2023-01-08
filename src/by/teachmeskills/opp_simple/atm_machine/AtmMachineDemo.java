package by.teachmeskills.opp_simple.atm_machine;
/*
    Создать класс, описывающий банкомат.
    Набор купюр, находящихся в банкомате, должен задаваться тремя свойствами:
        - количеством купюр номиналом 20, 50 и 100.
    Сделать метод для добавления денег в банкомат.

    Сделать функцию, снимающую деньги, которая принимает сумму денег, а возвращает
    булевое значение - успешность выполнения операции. При снятии денег функция должна
    распечатывать каким количеством купюр какого номинала выдаётся сумма.

    Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
 */

public class AtmMachineDemo {
    public static void main(String[] args) {
        final int WITHDRAWAL_AMOUNT = 550;
        AtmMachine atm1 = new AtmMachine(100, 50, 20);
        //atm1.addBills(0, 0, 10);
        System.out.println(atm1);
        System.out.println();
        if (!atm1.cashWithdrawal(WITHDRAWAL_AMOUNT)) {
            System.out.println("There is not enough money in the ATM");
        }
        System.out.println();
        System.out.println(atm1);

    }
}
