import ru.netology.stats.StatsService;

public class Main {

    public static void main(String[] args) {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        System.out.println("Total months " + sales.length);
        System.out.println("Total sales sum " + service.totalSalesSum(sales));
        System.out.println("Average sales sum " + service.averageSalesSum(sales));
        System.out.println("Number of month with max sale " + service.maxSales(sales));
        System.out.println("Number of month with min sale " + service.minSales(sales));
        System.out.println("Number of month below average sales sum " + service.countBadMonths(sales));
        System.out.println("Number of month above average sales sum " + service.countGoodMonths(sales));


    }

}
