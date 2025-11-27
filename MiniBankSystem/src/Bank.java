import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String bankName;
    private List<Account> accounts;

    // Konštruktor
    public Bank(String bankName) {
        this.bankName = bankName;
        this.accounts = new ArrayList<>();
    }

    // Gettery a settery
    public String getBankName() {
        return bankName;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    // Správa účtov
    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account findAccount(String accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        return null;
    }

    public boolean transfer(String fromAcc, String toAcc, double amount) {
        Account from = findAccount(fromAcc);
        Account to = findAccount(toAcc);

        if (from != null && to != null && from.withdraw(amount)) {
            to.deposit(amount);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
