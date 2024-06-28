import java.util.Random;

public class App {

    public static void main(String[] args) {

        Random rand = new Random();

        double total = rand.nextDouble(100,100000);
        int days = rand.nextInt(1,365);
        double sales = total / days;

         String resultTotal = String.format("%.2f", total);
         String resultSales = String.format("%.2f", sales);

        System.out.println("Product No 1: smartphone, \n" +
                "total sales for " + days + " days is EUR " + resultTotal + "\n" +
                "sales by day is EUR " + resultSales);

        total = rand.nextDouble(100,100000);
        days = rand.nextInt(1,365);
        sales = total / days;

        resultTotal = String.format("%.2f", total);
        resultSales = String.format("%.2f", sales);

        System.out.println("Product No 2: laptop, \n" +
                "total sales for " + days + " days is EUR " + resultTotal + "\n" +
                "sales by day is EUR " + resultSales);


    }
}
