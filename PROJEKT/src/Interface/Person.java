package Interface;

public class Person implements Cloneable{
    String name;
    int age;
    String gender;

    public void getGoal(){
        System.out.println("My goal is: Live for the moment");
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
        this.name = "Adam";
        this.age = 23;
        this.gender = "male";
    }

    public void introduce(){
        System.out.println("Hi I am" + name + "a" + age + "old" + gender);
    }

    @Override
    public Person clone() {
        return new Person(this.name, this.age, this.gender);
    }


    public String getName() {
        return name;
    }
}
