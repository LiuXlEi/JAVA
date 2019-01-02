//要求设计一个方法，用于计算任意参数的整数的相加结果。
//范例：早期实现方式

public class Day32 {
    public static void main(String[] args) {
    System.out.println(add(new int[]{1}));
    System.out.println(add(new int[]{1,2,3}));
    System.out.println(add(new int[]{1,2,3,4,5,6,7,8}));
    }
    public static int add(int[] data) {
    int result = 0 ;
    for (int i = 0; i < data.length; i++) {
    result += data[i] ;
    }
    return result ;
    }
    }