


//观察向上转型


class Person{
    public void print(){
    System.out.println("1.我是爸爸！");
    }
    }
    class Student extends Person{
    public void print(){
    System.out.println("2.我是儿子！");
    }
    }
    public class Day16{
    public static void main(String[] args) {
    Person per = new Student(); //向上转型
    per.print();
    }
    }