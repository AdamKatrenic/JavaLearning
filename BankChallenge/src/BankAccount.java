public class BankAccount {

    private int number;
    private double balance;
    private String name;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount(int number, double balance, String customerName, String name) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount) {
        balance += depositAmount;
        System.out.println("Deposited " + depositAmount + " new balance " + this.balance);
    }

    public void withdraw(double withdrawAmount) {
        if (balance - withdrawAmount < 0) {
            System.out.println("Insufficient funds! You only have $" + balance + " in  your account.");
        }else  {
            balance -= withdrawAmount;
            System.out.println("Withdrawn " + withdrawAmount + " new balance " + this.balance);
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

