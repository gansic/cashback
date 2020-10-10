public class main {
    public static void main(String[] args) {
        BankService cashback = new BankService();
        double result = cashback.calculate (3000,3000,17000);
        System.out.println(result);


    }
}
