package enum_i;

/* Created by wly on 17-3-19.
  1.public abstract class Enum<E extends Enum<E>> implements Comparable<E>, Serializable
    解读<E extends Enum>,Enum只接受一个Enum或者他的子类作为类型参数，传入到自身。
  2.可以把enum看做普通的class,可以定义一些属性和方法。
  3.enum不能使用extends关键字继承其他类。(enum已经继承了java.lang.Enum。JAVA是单一继承。)
  4.创建枚举类型要使用enum关键字,隐含所创建的类型都是java.lang.Enum(抽象类)的子类。
  5.枚举类型符合通用模式Class Enum<E extends Enum<E>>,E表示枚举类型的名称。
  6.枚举类型的每一个值都将映射到Protected Enum(String name, int ordinal)构造函数中；
    每个name都被转换成一个字符串,每个ordinal设置表示了此设置被创建的顺序。
 */
public enum EnumFeature {
}
