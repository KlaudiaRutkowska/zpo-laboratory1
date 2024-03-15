package exercise5;

public class PolandTax implements Tax {
    double taxValue = 0.23;

    public double calculateTax(double price) {
        return price * taxValue;
    }
}