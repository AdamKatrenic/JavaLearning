package Interface;

public class Sponsor extends  Person{

    String company;
    int hiredStudents;

    public Sponsor(String name, int age, String gender, String company, int hiredStudents) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = hiredStudents;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I am" + name + "a" + age + "year old" + gender + "who represents" +
                company + "and hired" + hiredStudents + "students so far.");
    }

    @Override
    public void getGoal() {
        System.out.println("Hire brilliant junior software developers");
    }

    public void hire(){
        hiredStudents++;
    }
}
