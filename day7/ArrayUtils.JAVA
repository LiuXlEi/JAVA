//Java数组章节练习题
public class ArrayUtils{

    //1.计算数组中最大值
    public static int arrayMaxElement(int[] data){
         //TODO 
         java.util.Arrays.sort(data);
         System.out.println(data [4]);
         
        return data[4];
    }
    
    //2.计算数组中最小值
    public static int arrayMinElement(int[] data){
        //TODO
         java.util.Arrays.sort(data);
         System.out.println(data [0]);
         
        return data[0];
      
    }
    
    
    //3.计算数组值之和
    public static int arrayElementSum(int[] data){
        //TODO
         int x = 0;
        for(int a = 0 ; a < data.length ; a++){
           
            x += data[a];

        }
        System.out.println(x);
        return x;
    }
    
    //4.数组拼接
    // A {1,3,5,7,9} B {2,4,6,8,10} -> {1,3,5,7,9,2,4,6,8,10}
    public static void  arrayJoin(int[] a, int[] b){
        //TODO

        int i = 0 ;
        int x = a.length+b.length;
        int [] c = new int [x] ;
        for( i = 0 ; i < a.length ; i++){
            c[i]=a[i];
        }
           for( i = 0 ; i < b.length ; i++){
           c[i+a.length]=b[i];
           }
        for(i=0;i<x;i++){
             System.out.println(c[i]+"、"); 
        }
        
    }

    //5.数组截取
    //[start, end)
    // A {1,3,5,7,9} ->(A,1,3) > {3,5}
    public static void arraySub(int[] data, int start , int end){
        //TODO

        int mid = end - start;
        int x[] = new int[mid];
        for(int i = 0; i<mid ; i++)
        {
            x[i] = data[start + i + 1];  
        }
      
        for(int i = 0 ; i<mid ; i++)
        {
            System.out.println(x[i]);
        }
     
    }
    
    //6.数组打印
    public static void printArray(int[] data){
        //TODO
        for(int i =0 ; i < data.length ; i++){
        System.out.println(data[i]+"、");
        
        }
    }
    
    //7.数组反转
    // 比如：[1,2,3,4] => [4,3,2,1]
    public static void printReversal(int[] data){
        //TODO
         
        for(int i = data.length-1;i >= 0 ;i--)
        {
            System.out.println(data[i])
        }    
        
        
    }
    
    public static void main(String[] args){
        //TODO 测试      
        int[] data= new int [] {1,3,5,7,9};
        int[] a= new int [] {1,3,5,7,9};
        int[] b= new int [] {2,4,6,8,10};
        int start =1;
        int end =4;
        arrayMinElement(data);
        arrayMaxElement(data); 
        arrayElementSum(data);
        arrayJoin(a,b); 
        arraySub(data,start,end);
        printArray(data);
        printReversal(data);

    }
}