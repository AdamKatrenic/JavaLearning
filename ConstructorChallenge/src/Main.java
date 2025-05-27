public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("adam", 1000, "adamkatrenic@gmail.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmailAdress());
    }
}
