public class MonthlyPayment {
    public static void main(String[] args) {
        double p = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double r = Double.parseDouble(args[2]);
        double value = monthlyPayment(p, y, r);
        System.out.println("Monthly payment : Rs." + value);
    }

    static double monthlyPayment(double p, double y, double r) {
        double n = 12 * y;
        double r0 = r / (12 * 100);
        double payment = p * r0 / (1 - Math.pow((1 + r0), -n));

        return payment;
    }
}
