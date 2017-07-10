package generic_i;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wly on 17-3-1.
 */
public class GenericExample {
    //定义方法时有形参,调用方法时传递实参。
    //泛型,即"参数化类型"：将原来具体的类型参数化,类似方法中的变量参数。
    //将类型定义成参数形式(如称其为:类型形参),在使用or调用时传入具体的类型(如称其为:类型实参)。

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("liyu.wang");
        list.add("qian.wang");
//        list.add(100);

        for (int i = 0; i < list.size(); i++){
            String name = list.get(i);
            System.out.println("name:" + name);
        }
    }
}

    //上面的泛型定义,在List<String>中,String是类型实参,也就是说,相应的List接口中肯定含有类型形参。
    //且get()方法的返回结果也直接是此形参类型(也就是对应的传入的类型实参)。
