import java.util.Scanner;

public class StockTrading {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String stockName = "ABC Ltd";
        double stockPrice = 500;
        double balance = 10000;
        int shares = 0;

        System.out.println("=== Stock Market ===");
        System.out.println("Stock: " + stockName);
        System.out.println("Price: ₹" + stockPrice);

        System.out.print("Enter shares to buy: ");
        int buy = sc.nextInt();

        if (buy * stockPrice <= balance) {
            shares += buy;
            balance -= buy * stockPrice;
        }

        System.out.print("Enter shares to sell: ");
        int sell = sc.nextInt();

        if (sell <= shares) {
            shares -= sell;
            balance += sell * stockPrice;
        }

        System.out.println("\n=== Portfolio Summary ===");
        System.out.println("Shares Owned: " + shares);
        System.out.println("Balance: ₹" + balance);

        sc.close();
    }
}
