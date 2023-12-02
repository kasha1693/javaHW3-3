public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double credit = 1_000_000;
        double percent = 9.99;
        double month = 12;

        double myCredit = service.calculate(1_000_000, 9.99, 12);
        System.out.println(myCredit);

    }
}
