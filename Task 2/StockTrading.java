public class StockTrading {
    public static void main(String[] args) {

        double balance = 10000;
        double stockPrice = 500;
        int shares = 0;

        // Buy 10 shares
        shares += 10;
        balance -= 10 * stockPrice;

        // Sell 5 shares
        shares -= 5;
        balance += 5 * stockPrice;

        System.out.println("Stock Price: ₹" + stockPrice);
        System.out.println("Shares Owned: " + shares);
        System.out.println("Remaining Balance: ₹" + balance);
    }
}
