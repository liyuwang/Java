package loop;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by wly on 17-3-2.

 for(exp1; exp2; exp3) {
    exp4;
 }

 执行顺序:
        1.首先执行exp1(初始化语句)
        2.执行exp2(判断语句)
          符合,执行exp4;
          不符合,不执行exp4;
        3.执行exp3
        4.执行exp2
           ...
 */
public class ForLoop {
    public static void main(String[] args) {
        // 清单1:遍历数组的传统方式
        int[] integers = {1,2,3,4};
        for(int i=0; i<integers.length; i++){
            System.out.println(integers[i]);
        }

        //清单2:遍历Collection对象的传统方式
        String[] strings = {"A","B","C","D"};
        Collection stringList = Arrays.asList(strings);

        for(Iterator itr = stringList.iterator(); itr.hasNext();){
            Object str = itr.next();
            System.out.println(str);
        }

        //清单3:遍历数组的简单方式
        String[] string = {"a","b","c","d"};
        for(String s:string){
            System.out.println(s);
        }

        //清单4:遍历Collection的简单方式的等价代码
        String[] str = {"A","B","C","D"};
        Collection stringL = Arrays.asList(strings);
        for (Object st: stringL){
            System.out.println(st);
        }
    }
}
