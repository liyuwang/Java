package polymorphism_i;

import java.security.PublicKey;

/**
 * Created by wly on 17-7-10.
 */
public class Person {

    public String sex = "female";

    public void func1(){
        func2();
    }

    public void func2(){
        System.out.println("func2 of Person");
    }

}
