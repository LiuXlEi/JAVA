

//要求定义一个方法，这个方法可以接收Person类的所有子类实例，并调用Person类的方法。


class Person{
    public void print(){
    System.out.println("1.我是人类！");
    }
    }
    class Student extends Person{
    public void print(){
    System.out.println("2.我是学生！");
    }
    }
    class Worker extends Person{
    public void print(){
        System.out.println("3.我是工人！");
    }
    }
    public class Day19{
    public static void main(String[] args) {
    whoYouAre(new Student());
    whoYouAre(new Worker());
    }
    public static void whoYouAre(Person per){
    per.print();
    }
    }