package enum_i;

/*
 * Created by wly on 17-3-19.

 Enum出现之前,使用类似代码实现枚举功能:
 public class Color{
    Public static final int COLOR_RED = 0;
    public static final int COLOR_GREEN = 1;
    public static final int COLOR_YELLOW = 2;
 }

 public class ConstantInvoke{
    public void doSomeOp(int color){
        some codes... //调用color静态常量
    }
 }

 上述实现有以下弊端:
    1.安全性差
      doSomeOp可以接受Color静态变量以外的值,如doSomeOp(3),这种情况下,可能程序会产生异常.
    2.可读性差
      doSomeOp(0),可以正常运行,但程序的可读性差,尤其表现在日志打印中.
*/

public enum EnumBorn {
}
