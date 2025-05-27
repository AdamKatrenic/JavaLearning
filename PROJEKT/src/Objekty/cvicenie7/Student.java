package Objekty.cvicenie7;

public class Student {

    public void ask(){
        System.out.println("Student is asking a question");
    }


    public void learn(){
        System.out.println("Student is actually learning");
    }

    public void question(Teacher ucitel1){
        ucitel1.giveAnswer();
    }
}
