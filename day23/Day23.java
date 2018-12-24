

//编写一个程序，展示无论你创建了某个特定类的多少个对象，这个类的某个特定的static成员变量只有一个属性。 


class test{
    public String name;
    public static String school;
    public static String thing;
}
 
public class Day23{
    public static void main(String[]args){
        test A=new test();
        A.name="张三";
        A.school="在西科大";
        A.thing="上学";
        System.out.println(A.name+A.school+A.thing);
        test B=new test();
        B.name="李四";
        B.school="在西工大";
        B.thing="教书";
        System.out.println(B.name+B.school+B.thing);
    }
}
