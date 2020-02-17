
package week8;


public class Week8 {

    
    public static void main(String[] args) {
        /*
        for(int i = 0; i < 5; i++){
            System.out.println("Hi");
        }
        System.out.println("After 100 lines of code");
        for(int i = 0; i < 5; i++){
            System.out.println("Hello");
        }
        */
        //method calling = method run
        //sayHello("Tea");
        //sayHello("Coffee");
        //add(5, 2);
        //int x = multiplay(2,3);
        //System.out.println(x * 2);
        //System.out.println("storing in database");
        int[] numbers = {3,2,7,4,1,3,7};
        printArr(numbers);
        String[] x = {"Android","PHP","Java"};
        printArr(x);
    }//main end
    //declaration
    public static void add(int x, int y){
        System.out.println(x + y);
    }
    public static int multiplay(int x, int y){
        //System.out.println(x * y);
        return x * y;
    }
    public static void printArr(int[] x){
        for(int s = 0; s < x.length; s++){
            System.out.println(x[s]);
        }
    }
     public static void printArr(String[] x){
        for(int s = 0; s < x.length; s++){
            System.out.println(x[s]);
        }
    }
      public static void printArr(String[] x,int y){
        for(int s = 0; s < x.length; s++){
            System.out.println(x[s]);
        }
    }
      public static void printArr(int y,String[] x){
        for(int s = 0; s < x.length; s++){
            System.out.println(x[s]);
        }
    }
    
}
