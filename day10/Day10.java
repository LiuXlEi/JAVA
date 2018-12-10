//
//创建一个Test类，包含有一个public权限的int型成员变量
//与一个char类型的成员变量，观察在main方法中的初始值。
//


class Test{
    public int i;
    public char a;
}
public class Day10{
    public static void main(String[] args) {
        Test test=new Test();
        System.out.println(test.i);
        System.out.println(test.a);
    }

}
