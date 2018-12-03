//类的定义

class Person{
    public String name;
    public int age;
    public void fun(){
        System.out.println(name+"在"+age+"岁打豆豆");
    }
}
public class Day3{
    public static void main (String [] args){
        //根据Person类产生一个person对象
        Person per = new Person();
        per.name="马云";
        per.age=50;
        per.fun();

    }
}