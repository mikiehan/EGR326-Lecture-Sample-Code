import java.util.*;

public class Wallet {
    private List<Coin> coins;

    public Wallet() {
        coins = new ArrayList<Coin>();
    }

    public void add(Coin coin) {
        coins.add(coin);
    }

    public int getTotal() {
        int total = 0;
        for (Coin coin : coins) {
            total += coin.getCents();
        }
        return total;
    }
}
