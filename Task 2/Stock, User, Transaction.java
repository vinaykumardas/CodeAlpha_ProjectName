class Stock {
    String name;
    double price;

    Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class User {
    String name;
    double balance;
    int shares;

    User(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.shares = 0;
    }
}

class Transaction {
    void buy(User user, Stock stock, int qty) {
        double cost = qty * stock.price;
        if (cost <= user.balance) {
            user.balance -= cost;
            user.shares += qty;
        }
    }

    void sell(User user, Stock stock, int qty) {
        if (qty <= user.shares) {
            user.balance += qty * stock.price;
            user.shares -= qty;
        }
    }
}

public class StockTrading {
    public static void main(String[] args) {

        Stock stock = new Stock("ABC Ltd", 500);
        User user = new User("Ash", 10000);

        Transaction t = new Transaction();

        t.buy(user, stock, 10);
        t.sell(user, stock, 5);

        System.out.println("User: " + user.name);
        System.out.println("Shares: " + user.shares);
        System.out.println("Balance: ₹" + user.balance);
    }
}
