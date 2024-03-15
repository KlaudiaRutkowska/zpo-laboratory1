package exercise5;

public class UKTax implements Tax {
    double taxValue = 0.20;

    public double calculateTax(double price) {
        return price * taxValue;
    }
}