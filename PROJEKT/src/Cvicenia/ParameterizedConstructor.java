package Cvicenia;

public class ParameterizedConstructor {
    public static class Dog{
        String name;
        String color;

        public Dog(String name, String color) {
            this.name = name;
            this.color = color;
        }
    }

    public void main(String[] args) {
        Dog duno = new Dog("Dunco", "green");

        System.out.println("Dog name: " + duno.name);
        System.out.println("Dog color" + duno.color);
    }


}
