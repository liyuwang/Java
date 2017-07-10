package polymorphism_i;

/**
 * Created by wly on 17-2-27.
 */
public class Test {
    public static void testAnimalVoice(Animal c){
        c.voice();
    }

    public static void main(String[] args) {
        Animal a = new Cat();
        testAnimalVoice(a);

        Cat a2 = (Cat) a;
        a2.seedoor();
    }

}
