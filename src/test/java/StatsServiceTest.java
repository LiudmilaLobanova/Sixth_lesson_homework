import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

import java.time.chrono.IsoEra;

public class StatsServiceTest {
    @Test
    public void shouldEqualTotalSalesSum() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 7, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 174;
        long actual = service.totalSalesSum(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldEqualAverageSalesSum() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 7, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 14;
        long actual = service.averageSalesSum(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldBeLastMonthWithMaxSale() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 7, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8;
        long actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldBeLastMonthWithMinSale() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 7, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 9;
        long actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void numberOfMonthsBelowAverageSale() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 7, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 3;
        long actual = service.countBadMonths(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void numberOfMonthsAboveAverageSale() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 7, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 7;
        long actual = service.countGoodMonths(sales);

        Assertions.assertEquals(expected, actual);

    }
}
