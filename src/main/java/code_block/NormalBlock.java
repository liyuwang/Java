package code_block;

/**
 * Created by wly on 17-3-11.
 * 代码块的执行顺序:静态代码块 > main方法 > 构造代码块 > 构造方法
 * 静态代码块只执行一次。构造代码块在每次创建对象时都会执行。
 */
public class NormalBlock {
    //在方法或语句中出现的{},叫做普通代码块。
    //执行顺序：与一般语句一样，在代码中先出现先执行。

    public static void main(String[] args) {
        {
            int x = 1;
            System.out.println("1.普通代码块内的变量x = " + x);
        }

        int x = 2;
        System.out.println("2.主方法内的变量x = " + x);

        {
            int y = 3;
            System.out.println("3.普通代码块内的变量y = " + y);
        }
    }

}
