

//水仙花数


public class Day11 {
 
    public static void main(String[] args) {
            flower();
    }
        public static void flower() {
            int x = 0,y = 0,z = 0;
            for(int i = 100;i<1000;i++) {
                x = i/100;
                y = (i%100)/10;
                z = (i%100)%10;
                if(x*x*x + y*y*y +z*z*z == i) {
                    System.out.println(i);
                }
            }
        }
    }

    
