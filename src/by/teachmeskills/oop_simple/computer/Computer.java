package by.teachmeskills.oop_simple.computer;

public class Computer {
    private final int price;
    private final String model;
    private Ram ram;
    private Hdd hdd;

    public Computer(int price, String model) {
        this.price = price;
        this.model = model;
    }

    public Computer(int price, String model, Ram ram, Hdd hdd) {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    public int getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public Ram getRam() {
        return ram;
    }

    public Hdd getHdd() {
        return hdd;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                '}';
    }
}