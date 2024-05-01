public class LongMethodExample {

    public double calculateTotalCost(int quantity1, double price1, int quantity2, double price2, int quantity3, double price3) {

        double totalCost = 0;

        totalCost += quantity1 * price1;

        totalCost += quantity2 * price2;

        totalCost += quantity3 * price3;

        return totalCost;
    }
}