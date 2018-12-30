

//现在有一个字符串判断其是否由数字所组成
//因为现在不知道字符串的长度以及包含的内容，所以最好的做法是将字符串变为字符数组而后判断每一位字符是否
//是" 0 "~"'9'"之间的内容，如果是则为数字。



public class Day29{

public static void main(String[] args) {
    String str = "1a23456" ;
    System.out.println(isNumber(str)? "字符串由数字所组成！" : "字符串中有非数字成员！");
    }
    // 一般而言，如果方法返回boolean类型，往往以isXXX()命名
    public static boolean isNumber(String str) {
    
        char[] data = str.toCharArray() ;
    
        for (int i = 0; i < data.length; i++) {
    
            if (data[i]<'0'||data[i]>'9') { // 不是数字，停止遍历
    
                return false ;
 
            }

        }


        return true ;
}
}