package Interface;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Jane Doe", 30, "female", "The School of Life" , 0);
        Mentor mentor1 = new Mentor("Jane Doe",30, "female", "intermediate");
        Sponsor sponsor1 = new Sponsor("Jane Doe", 30, "female", "Google", 0);
        Cohort cohort1 = new Cohort("Class");

        Student john = new Student("John",20,"male","BME",0);

        Student Adam = new Student();
        Student AdamCloned = Adam.clone();

        Student Tomas = new Student("Tomas", 20, "male", "Hertink", 2);
        Tomas.introduce();

        AdamCloned.introduce();


        cohort1.addStudent(AdamCloned);
        cohort1.addStudent(Adam);
        cohort1.addStudent(Tomas);

        Adam.introduce();

        cohort1.addStudent(john);

        cohort1.info();

    }
}
