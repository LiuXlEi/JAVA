
class Person{
    private String name;
    private int age;
    public Person(){
        System.out.println("**************************");
    }
    public Person(String name){
        this();
        this.name=name;
    }
    public Person(String name,int age){
        this(name);
        this.age=age;
    }
    public void setName(String name){ 
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}

public class Day5{
     public static void main(String[] args) {

        Person per = new Person("张三",20);
    
       System.out.println(per.getName());
       System.out.println(per.getAge());
     }
        
    }

 
    