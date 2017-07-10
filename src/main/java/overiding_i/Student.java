package overiding_i;


/**
 * Created by wly on 17-7-10.
 */
public class Student extends Person {
    public void print(){
        System.out.println("This is a Student!");
    }

    public void super_print(){
        super.print();
    }

    public static void main(String[] args) {
        Student p = new Student();
        p.print();
        p.super_print();
    }
}
