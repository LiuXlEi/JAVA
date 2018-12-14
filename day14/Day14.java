

//实例属性的内存分析

class Person{
    String Country = "中国";
    String name;
    int age;
    public void getPersonInfo(){
    System.out.println("姓名:"+this.name+",年龄："+this.age+"，国家："+this.Country);
    }
}
    public class Day14{
    public static void main(String[] args) {
    Person p1 = new Person();
    p1.name = "张三" ;
    p1.age = 10 ;
    Person p2 = new Person();
    p2.name = "李四" ;
    p2.age = 20 ;
    p1.getPersonInfo();
    p2.getPersonInfo();
    }
}