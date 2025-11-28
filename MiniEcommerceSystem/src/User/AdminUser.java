package User;

public class AdminUser extends User {
    public AdminUser(String username, String password) {
        super(username, password);
    }

    @Override
    public void showMenu() {
        System.out.println("1. Pridať produkt");
        System.out.println("2. Odstrániť produkt");
        System.out.println("3. Zobraziť všetky produkty");
    }
}