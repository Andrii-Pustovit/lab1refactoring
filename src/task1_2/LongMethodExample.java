package task1_2;

public class LongMethodExample {

    public double calculateTotalCost(int quantity1, double price1, int quantity2, double price2, int quantity3, double price3) {
        double totalCost = 0;
        totalCost += calculateCost(quantity1, price1);
        totalCost += calculateCost(quantity2, price2);
        totalCost += calculateCost(quantity3, price3);
        return totalCost;
    }

    private double calculateCost(int quantity, double price) {
        return quantity * price;
    }
}

