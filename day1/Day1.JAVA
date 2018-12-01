public class Day1{
    public static void main(String[] args){
        int [] x =null;
        int [] temp =null;
        x=new int[3];
        System.out.println(x.length);
        x[0]=1;
        x[1]=3;
        x[2]=5;
        for(int i = 0; i < x.length ; i++){
            System.out.print(x[i]+"、");
        }
        temp =x;
        temp[0]=55;
        System.out.println(x[0]);
  

    }
   
}