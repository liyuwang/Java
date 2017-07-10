package code_block;

/**
 * Created by wly on 17-3-11.
 * 直接在类中定义、带有static关键字的代码块。
 * 静态代码块用于初始化类、为类的属性初始化。每个静态代码快只执行一次。
 * JVM加载类时执行静态代码块，所以静态代码块先于主方法执行。多个静态代码块之间，先定义的先执行。
 * 静态代码快不能被置于方法体内。静态代码块不能直接访问实例变量和实例方法，需要通过类的实例对象来访问。
 */
public class StaticBlock {
    {
        System.out.println("StaticBlock构造代码块");
    }

    static {
        System.out.println("StaticBlock静态代码块");
    }

    public StaticBlock(){
        System.out.println("StaticBlock构造方法");
    }

}

class StaticBlockAnother{

    static {
        System.out.println("StaticBlockAnother静态代码块");
    }

    public StaticBlockAnother(){
        System.out.println("StaticBlockAnother构造方法");
    }

    {
        System.out.println("StaticBlockAnother构造代码块");
    }

    public static void main(String[] args) {
        //静态代码块随类的加载而被调用，而且静态代码块优先于普通代码块和构造器执行。
        //当进入主函数时，先加载的是StaticBlockAnother类，所以先输出"StaticBlockAnother静态代码块"。
        System.out.println("StaticBlockAnother的主方法");
        new StaticBlock();
        new StaticBlock();
        new StaticBlockAnother();
        new StaticBlockAnother();
    }
}
