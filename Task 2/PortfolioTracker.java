public class PortfolioTracker {
    public static void main(String[] args) {

        double[] portfolioValue = {10000, 10500, 10200, 11000, 11500};

        System.out.println("Portfolio Performance Report");

        for (int i = 0; i < portfolioValue.length; i++) {
            System.out.println("Day " + (i + 1) + ": ₹" + portfolioValue[i]);
        }

        double profit = portfolioValue[portfolioValue.length - 1]
                        - portfolioValue[0];

        System.out.println("Total Profit/Loss: ₹" + profit);
    }
}
