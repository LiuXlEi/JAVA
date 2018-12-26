//
//创建一个带默认构造方法（即无参构造）的类，
//构造方法中打印一条消息"Hello Constructor";
//再为这个类添加一个重载构造方法，令其接收一个字符串参数，
//并在这个有参构造方法中把"Hello Constructor"和接收的参数一起打印出来。 
//


class Person{
    public Person(){
        System.out.println("Hello Constructor!");
    }
    public Person (String str){
        this ();
        System.out.println(str);
    }

}
public class Day25
{
    public static void main (String[] args) {
        Person per = new Person("Hello Constructor!");
    }

}