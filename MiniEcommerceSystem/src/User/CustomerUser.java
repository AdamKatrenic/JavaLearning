package User;

import ShoppingCart.ShoppingCart;

public class CustomerUser extends User {
    private ShoppingCart cart = new ShoppingCart();

    public CustomerUser(String username, String password) {
        super(username, password);
    }

    @Override
    public void showMenu() {
        System.out.println("1. Pridať produkt do košíka");
        System.out.println("2. Zobraziť košík");
        System.out.println("3. Vytvoriť objednávku");
    }

    public ShoppingCart getCart() {
        return cart;
    }
}