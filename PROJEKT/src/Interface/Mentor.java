package Interface;

public class Mentor extends Person{

    String level;

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    @Override
    public void getGoal(){
        System.out.println("Educate brilliant junior software developers");
    }

    @Override
    public void introduce() {
        System.out.println("Hi, im" + name + "a" + age + "year old" + gender + level + "mentor");
    }


}
