package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldMinSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSale = 9;
        long actualSale = service.minSales(sales);
        Assertions.assertEquals(expectedSale, actualSale);
    }

    @Test
    public void shouldSumAllSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSum = 180;
        long actualSum = service.sumAllSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldAverageSumAllSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAveSum = 15;
        long actualAveSum = service.averageSum(sales);
        Assertions.assertEquals(expectedAveSum, actualAveSum);
    }

    @Test
    public void shouldMaxSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMaxSale = 8;
        long actualMaxSale = service.maxSales(sales);
        Assertions.assertEquals(expectedMaxSale, actualMaxSale);
    }

    @Test
    public void shouldMonthLessAverageSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonthLess = 5;
        long actualMonthLess = service.monthLessAverageSum(sales);
        Assertions.assertEquals(expectedMonthLess, actualMonthLess);
    }

    @Test
    public void shouldMonthMoreAverageSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonthMore = 5;
        long actualMonthMore = service.monthLessAverageSum(sales);
        Assertions.assertEquals(expectedMonthMore, actualMonthMore);
    }
}
