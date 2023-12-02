public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double credit = 1_000_000;
        double percent = 0.0999;
        double month = 12;

        double myCredit = service.calculate1(1_000_000, 0.0999, 12);
        System.out.println(myCredit);

        myCredit = service.calculate1(1_000_000, 0.0999, 24);
        System.out.println(myCredit);

        myCredit = service.calculate1(1_000_000, 0.0999, 36);
        System.out.println(myCredit);

    }
}
