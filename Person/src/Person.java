public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int setAge(int age) {
        if (age < 0 || age > 100) {
            return 0;
        }
        return age;
    }
    public boolean isTeen(){
        if (age > 12 || age < 20) {
            return true;
        }return  false;
    }
    public String getFullName(){
        if (firstName == null && lastName == null){
            return " ";
        }else if (firstName == null){
            return lastName;
        }else if (lastName == null){
            return firstName;
        }
        return firstName + " " + lastName;
    }
}
