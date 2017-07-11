package polymorphism_i;

/**
 * Created by wly on 17-2-27.
 */
public class Test {
    public static void testAnimalVoice(Animal a){
        a.voice();
    }

    public static void main(String[] args) {
        Animal a = new Cat();
        testAnimalVoice(a);

        Dog d = new Dog();
        d.guard();
    }

}
