public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double credit = 1000000;
        double percent = 9.99;
        double month = 24;

        double myCredit = service.calculate(1000000, 9.99, 24);
        System.out.println(myCredit);
    }
}
