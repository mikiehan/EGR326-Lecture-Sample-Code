// import Coin.*;

public class UseCoins {
    public static void main(String[] args) {
        Wallet w = new Wallet();
        w.add(Coin.PENNY);
        w.add(Coin.NICKEL);
        w.add(Coin.NICKEL);
        w.add(Coin.NICKEL);
        w.add(Coin.QUARTER);
        System.out.println(w.getTotal());
    }
}
