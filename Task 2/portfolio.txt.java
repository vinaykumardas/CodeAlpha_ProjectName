import java.io.FileWriter;
import java.io.IOException;

public class PortfolioSave {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("portfolio.txt");

            writer.write("User: Ash\n");
            writer.write("Balance: 7500\n");
            writer.write("Shares: 5\n");

            writer.close();

            System.out.println("Portfolio data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving file.");
        }
    }
}
