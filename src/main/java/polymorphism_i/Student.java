package polymorphism_i;

/**
 * Created by wly on 17-7-10.
 */
public class Student extends Person {

    public String sex = "male";

    public void func1(int i){
        System.out.println("func1 of Student。");
    }

    public void func2(){
        System.out.println("func2 of Student。");
    }

    public static void main(String[] args) {
        Person p = new Student();
        p.func1();
        System.out.println(p.sex);
    }
}

