package by.teachmeskills.oop_principles.phone;

import java.util.Arrays;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone() {
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println(name + " is calling");
    }

    public void receiveCall(String name, String number) {
        System.out.println(name + " is calling, number: " + number);
    }

    public void sendMessage(String... phoneNumbers) {
        System.out.println("The message is sent to: " + Arrays.toString(phoneNumbers));
    }

    public String getNumber() {
        return this.number;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
