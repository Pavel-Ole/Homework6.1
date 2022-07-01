package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public long sumAllSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long averageSum(long[] sales) {
        int sum = 0;
        int aveSum = 0;
        for (long sale : sales) {
            sum += sale;
            aveSum = sum / 12;

        }
        return aveSum;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int monthLessAverageSum(long[] sales) {
        long aveSum = averageSum(sales);
        int lessMonth = 0;
        for (long sale : sales) {
            if (sale < aveSum) {
                lessMonth++;
            }
        }
        return lessMonth;
    }

    public int monthMoreAverageSum(long[] sales) {
        long aveSum = averageSum(sales);
        int moreMonth = 0;
        for (long sale : sales) {
            if (sale > aveSum) {
                moreMonth++;
            }
        }
        return moreMonth;
    }
}
