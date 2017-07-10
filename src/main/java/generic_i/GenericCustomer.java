package generic_i;

/**
 * 自定义泛型
 * Created by wly on 17-3-1.
 */
public class GenericCustomer {
    public static void main(String[] args) {
        Box<String> b = new Box("hello world");
        System.out.println(b.getData());

        Box<String> name = new Box("corn");
        Box<Integer> age = new Box(712);
        System.out.println("name class: " + name.getClass());
        System.out.println("name class: " + age.getClass());
        System.out.println(name.getClass() == age.getClass());
        //使用泛型时，虽然传入了不同的泛型实参，但没有真正生成不同的类型，传入不同泛型实参的泛型类在内存上只有一个，即还是原来的最基本类型（本实例中为Box）。
        //Java中泛型这一概念提出的目的，只作用于代码编译阶段，编译过程中，对正确检验泛型结果后，将泛型的相关信息擦除，即成功编译后class文件中不包含泛型信息。泛型信息不会进入到运行时阶段。
    }
}

class Box<T>{
    private T data;

    public Box(){

    }

    public Box(T data){
        this.data = data;
    }

    public void setData(T data){
        this.data = data;
    }

    public T getData(){
        return data;
    }
}