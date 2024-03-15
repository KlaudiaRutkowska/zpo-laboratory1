package exercise5;

public class TaxCalculator {
    private Tax tax;

    public TaxCalculator(Tax tax) {
        this.tax = tax;
    }

    public void setTaxStrategy(Tax tax) {
        this.tax = tax;
    }

    public double calculateTax(double price) {
        return tax.calculateTax(price);
    }
}
