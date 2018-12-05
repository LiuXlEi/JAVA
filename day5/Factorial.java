
//递归实现20! 

public class Factorial{

    public static void main(String[] args){
   
        System.out.println(fac(20));
	} 
       
    public static long  fac(int n){
            if(n == 1)
                return 1L;//出口为长整型
            else
                return n*fac(n-1);
     }
}
