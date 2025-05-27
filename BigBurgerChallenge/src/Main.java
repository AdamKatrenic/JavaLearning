public class Main {

    public static void main(String[] args) {

//        Item coke = new Item("drink","coke",1.5);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Item avocado = new Item("Topping","avocado",1.5);
//        avocado.printItem();

//        Burger burger = new Burger("regular", 4.00);
//        burger.addToppings("BACON","CHEESE","MAYO");
//        burger.printItem();

//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerToppings("BACON","CHEESE","MAYO");
//        regularMeal.printItemizedList();

//        MealOrder secondMealOrder = new MealOrder("turkey","7-up","chili");
//        secondMealOrder.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
//        secondMealOrder.setDringSize("SMALL");
//        secondMealOrder.printItemizedList();

        MealOrder deluxeMeal  = new MealOrder("deluxe","7-up","chili");
        deluxeMeal.addBurgerToppings("AVOCADO", "BACON","LETTUCE","CHEESE","MAYO");
        deluxeMeal.setDringSize("SMALL");
        deluxeMeal.printItemizedList();

    }
}
