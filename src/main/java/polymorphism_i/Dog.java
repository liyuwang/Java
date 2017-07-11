package polymorphism_i;

/**
 * Created by wly on 17-7-11.
 */

public class Dog extends Animal{
    public void voice(){
        System.out.println("汪汪汪");
    }

    public void guard(){
        System.out.println("看门!");
    }
}