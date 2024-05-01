public class DiscountCalculator {

    public double getDiscountPercentage(String category) {

        double discount = 0;

        switch (category) {

            case "Electronics":

                discount = 0.1;

                break;

            case "Clothing":

                discount = 0.2;

                break;

            case "Books":

                discount = 0.15;

                break;

            default:

                discount = 0.05;

                break;

        }

        return discount;

    }

}