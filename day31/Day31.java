//一个数如果恰好等于它的因子之和，这个数就称为 "完数"。例如6=1＋2＋3.编程找出1000以内的所有完数。  


public class Day31{
    public static void main(String[] args){
    System.out.println("1000以内的素数有:");
    for(int i=1;i<=10000;i++){
        int sum=0;
        for(int j=1;j<=i;j++){
            if(i%j==0){
                sum+=j;}
            if(sum==i){
                System.out.println(i);
                break;}										}
                }
}
}
