public enum Coin {
    PENNY(1), NICKEL(5), DIME(10), QUARTER(25);

    private int cents;

    private Coin(int cents) {
        this.cents = cents;
    }

    public int getCents() {
        return cents;
    }

    public int perDollar() {
        return 100 / cents;
    }
}
