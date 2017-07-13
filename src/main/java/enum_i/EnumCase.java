package enum_i;

/**
 * Created by wly on 17-7-13.
 */
public enum EnumCase {
/*
    MON, TUE, WED, THU, FRI, SAT, SUN;
    这段代码调用了7次Enum(String name, int ordinal)
    new Enum<EnumCase>("MON",0)

    public static void main(String[] args) {
        for (EnumCase e : EnumCase.values()){
            System.out.println(e.toString());
        }
    }
*/

    //给enum自定义属性和方法
    MON(1), TUE(2), WED(3), THU(4), FRI(5), SAT(6) {
        @Override
        public boolean isRest(){
            return true;
        }
    },
    SUN(0) {
        @Override
        public boolean isRest(){
            return true;
        }
    };

    private int value;

    private EnumCase(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public boolean isRest(){
        return false;
    }

    public static void main(String[] args) {
        System.out.println("EnumCase.FRI的value=" + EnumCase.FRI.getValue());
    }

}
