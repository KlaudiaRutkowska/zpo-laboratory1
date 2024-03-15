package exercise5;

public class MainTax {
    public static void main(String[] args) {
        TaxCalculator calculator = new TaxCalculator(new PolandTax());
        System.out.println(calculator.calculateTax(4570.45));

        calculator.setTaxStrategy(new GermanyTax());
        System.out.println(calculator.calculateTax(160.99));
    }
}
