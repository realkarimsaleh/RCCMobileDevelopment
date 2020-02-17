package week7;

public class Week7 {

    
    public static void main(String[] args) {
        /*
        int x = 5;
        boolean cont = false;
        
        do{
            System.out.println("Hello");
            x++;
            System.out.println("Do you want to cont type (true, false)");
            cont = input.nextBoolean();
            //System.out.println("Over");
            //true
        }while(cont);
        */
        //String[] products = {"Dell","HP","Toshiba","Samsung","Lenovo"};
        /*
        int x = 5;
        while(x < 5){
            System.out.println("Hello");
            x++;
        }
        */
        /*
        int x = 0;
        while(x < products.length){
            System.out.println(products[x]);
            x++;
        }
        */
        
       String[] products = {"Dell","HP","Toshiba","Samsung","Lenovo"};
       /*
       for(int c = 0;c < products.length;c++){
           //System.out.println("hello");  
           System.out.println(products[c]);
       }*/
       for(String product : products){
           System.out.println(product);
        }
    }
    
}
