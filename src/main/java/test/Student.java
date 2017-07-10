package test;

/**
 * Created by wly on 17-7-10.
 */
public class Student  {
    public int add( int a, double b){
        return 1;
    }

    public int add(int a, int b){
        return 2;
    }

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.add(1, 2));
        System.out.println(s.add(2, 2.1));
    }
}

