package generic_i;

/**
 * Created by wly on 17-3-1.
 */
public class GenericWildcardBorn {

    public static void main(String[] args) {
        Box<Number> name = new Box<Number>(99);
//        Box<Integer> age = new Box<Integer>(712);
        getData(name);
//        getData(age);
    }

    public static void getData(Box<Number> data){
        System.out.println("data: " + data.getData());
        //在逻辑上，Box<Number>不能视为BOX<Integer>的父类。
        // 因此，需要一个在逻辑上可以用来表示同时是Box<Integer>和Box<Number>的父类的一个引用类型。
        //因此，类型通配符产生。
    }

}

