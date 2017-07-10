package polymorphism_i;

/**
 * Created by wly on 17-2-27.
 */
public class Animal {
    public void voice(){
        System.out.println("普通动物叫声!");
    }
}

class Cat extends Animal{
    public void voice(){
        System.out.println("喵喵喵");
    }

    public void seedoor(){
        System.out.println("看门!");
    }
}

class Dog extends Animal{
    public void voice(){
        System.out.println("汪汪汪");
    }
}