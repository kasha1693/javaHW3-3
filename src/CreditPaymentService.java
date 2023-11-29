public class CreditPaymentService {

    public double calculate(double credit, double percent, double month) {

        double payment = credit * percent / 12 * Math.pow((1 + percent / 12), month) / (Math.pow((1 + percent / 12), month) - 1);
        return (payment);
    }
}
