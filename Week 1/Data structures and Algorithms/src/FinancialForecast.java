public class FinancialForecast {
    public static void main(String[] args) {

        int[] years =    {1, 2, 3, 4, 5};
        double[] revenue = {100, 120, 150, 170, 200};

        int n = years.length;
        double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0;

        for (int i = 0; i < n; i++) {
            sumX += years[i];
            sumY += revenue[i];
            sumXY += years[i] * revenue[i];
            sumX2 += years[i] * years[i];
        }

        double slope = (n * sumXY - sumX * sumY) / (n * sumX2 - sumX * sumX);
        double intercept = (sumY - slope * sumX) / n;

        int yearToPredict = 6;
        double forecast = slope * yearToPredict + intercept;

        System.out.printf("Forecasted revenue for year %d: %.2f%n", yearToPredict, forecast);
    }
}
