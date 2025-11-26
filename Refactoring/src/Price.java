public abstract class Price {
    public abstract int getPriceCode();
    public abstract double getCharge(int daysRented);

    public int getFrequentRenterPoints(int daysRented) {
        if (getPriceCode() == Movie.NEW_RELEASE) {
            return 2;
        }
        return 1;
    }
}
