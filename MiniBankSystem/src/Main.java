public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Moja Banka");

        Account acc1 = new Account("001", "Peter", 500);
        Account acc2 = new Account("002", "Jana", 300);

        bank.addAccount(acc1);
        bank.addAccount(acc2);

        System.out.println(bank);

        bank.transfer("001", "002", 200);

        System.out.println(acc1);
        System.out.println(acc2);
    }
}
