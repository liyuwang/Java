package code_block;

/**
 * Created by wly on 17-3-11.
 * 直接在类中定义，且没有加static关键字的代码块称为{}构造代码块。
 * 构造代码块在创建对象时被调用，每次创建对象都会被调用，并且构造代码块的执行次序优先于构造方法。
 */
public class ConstructorBlock {
    {
        System.out.println("第一构造代码块");
    }

    public ConstructorBlock(){
        System.out.println("构造方法");
    }

    {
        System.out.println("第二构造代码块");
    }

    public static void main(String[] args) {
        System.out.println("主方法");
        new ConstructorBlock();
        new ConstructorBlock();
        new ConstructorBlock();

    }
}
