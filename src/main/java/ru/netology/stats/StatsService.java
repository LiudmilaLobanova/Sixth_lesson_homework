package ru.netology.stats;

public class StatsService {

    public int totalSalesSum(long[] sales) {

        int totalSum = 0;

        for (long s : sales) {
            totalSum += s;

        }
        return totalSum;
    }

    public int averageSalesSum(long[] sales) {

        int averageSum = totalSalesSum(sales) / sales.length;
        return averageSum;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int countBadMonths(long[] sales) {
        int cBMs = 0;
        for (long sale : sales) {
            if (sale < averageSalesSum(sales)) {
                cBMs++;
            }
        }
        return cBMs;

    }

    public int countGoodMonths(long[] sales) {
        int cGMs = 0;
        for (long sale : sales) {
            if (sale > averageSalesSum(sales)) {
                cGMs++;
            }
        }
        return cGMs;

    }

}
