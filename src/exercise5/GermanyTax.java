package exercise5;

public class GermanyTax implements Tax {
    double taxValue = 0.19;

    public double calculateTax(double price) {
        return price * taxValue;
    }
}