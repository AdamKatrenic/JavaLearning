package Interface;

public class Student extends Person implements Cloneable, Introducable{

    String previousOrganizations;
    int skippedDays;

    public Student(String name, int age, String gender) {
        super(name, age, gender);
    }

    public Student(String name, int age, String gender, String previousOrganizations, int skippedDays) {
        super(name, age, gender);
        this.previousOrganizations = previousOrganizations;
        this.skippedDays = skippedDays;
    }

    public Student() {
        super("Adam",23,"male");
        this.previousOrganizations = "SPST";
        this.skippedDays = 1;
    }

    @Override
    public void getGoal() {
        System.out.println("Be a junior software developer");
    }

//    @Override
//    public void introduce() {
//        System.out.println("Hi, I am " + name + " a " + age + " year old " + gender + " from " + previousOrganizations +
//                " who skipped " + skippedDays + " days from the course already.");
//    }

    public void skipDays(int numberOfDays){
        this.skippedDays += numberOfDays;
    }

    @Override
    public Student clone() {
        return new Student(this.name, this.age, this.gender, this.previousOrganizations, this.skippedDays);
    }

    @Override
    public void introduce() {
        System.out.println("Hi I am " + name + " a " + age + " old " + gender);
    }
}
