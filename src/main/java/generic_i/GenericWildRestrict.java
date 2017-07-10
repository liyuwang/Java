package generic_i;

/**
 * 类型通配符上限和类型通配符下限
 * Created by wly on 17-3-2.
 */
public class GenericWildRestrict {
    public static void main(String[] args) {
        Box<String> name = new Box<String>("corn");
        Box<Integer> age = new Box<Integer>(712);
        Box<Number> number = new Box<Number>(314);

        getData(name);
        getData(age);
        getData(number);

//        getUpperNumberData(name);
        getUpperNumberData(age);
        getUpperNumberData(number);
    }

    public static void getData(Box<?> data){
        System.out.println("data: " + data.getData());
    }

    //需要定义一个功能类似getData()的方法,但对类型实参又有进一步限制:只能是Number类及其子类。
    //此时，需要使用类型通配符上限。
    //类型通配符上限格式:Box<? extends Number>; 类型通配符下限格式:Box<? super Number>
    public static void getUpperNumberData(Box<? extends Number> data){
        System.out.println("data: " + data.getData());
    }
}
