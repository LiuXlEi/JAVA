

//.创建一个Test类，包含有一个public权限的int型成员变量与一个char类型的成员变量，观察在main方法中的初始值。 


class Test{//创建一个Test类
    public int i;//包含有一个public权限的int型成员变量与一个char类型的成员变量
    public char a;
}
public class Day22{//主类
    public static void main(String[] args) {//主函数
        Test test=new Test();//声明与实例化
        System.out.println(test.i);//输出
        System.out.println(test.a);
    }

}
