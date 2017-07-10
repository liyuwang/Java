package generic_i;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型的意义
 * Created by wly on 17-3-1.
 */
public class GenericBorn {
    //为什么需要泛型？ 通过泛型,集合记住各元素的类型,保证只要编译通过，运行时就不出现"java.lang.ClassCastException"异常。
    //对象放入集合时,集合不会记住对象的类型;对象从集合中取出时,该对象的编译类型变成了Object类型,运行时仍然为本身类型。
    //编译阶段正常,运行时出现"java.lang.ClassCastException"异常。此类错误编码过程中不易发现。
    //对于泛型，最主要的还是需要理解其背后的思想和目的。
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("liyu.wang");
        list.add("qian.wang");
        list.add(1);

        for (int i = 0; i < list.size(); i++){
            String name = (String) list.get(i);
            System.out.println("name:" + name);
        }
    }
}
