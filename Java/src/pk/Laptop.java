package pk;


public class Laptop extends Device {

    private String Operating_system;

    public Laptop(String brand, String model, double price) {
        super(brand, model, price);
    }

    @Override
    public String toString() {
        return
                "Operating_system='" + Operating_system + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(Device d) {
        return super.compareTo(d);
    }
}
