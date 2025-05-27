public class Customer {

    private String name;
    private double creditLimit;
    private String emailAdress;

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public Customer(String name, double creditLimit, String emailAdress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAdress = emailAdress;
    }

    public Customer() {
        this.name = name;
        this.creditLimit = getCreditLimit();
        this.emailAdress = getEmailAdress();
    }

    public Customer(String name, String emailAdress) {
        this(name, 1000, emailAdress);
    }
}
