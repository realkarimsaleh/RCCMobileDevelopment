
package week6;

import java.util.Scanner;


/*

*/

public class Week6 {

    
    public static void main(String[] args) {
        String name = "Khaled";
        //int age = 55;
         // > 20
         /*
         if(age > 20){
             //true
             System.out.println("Accepted");
         }else{
             //false
             System.out.println("Rejected");
         }
         */
         /*
        System.out.println("Enter number from 1 to 3");
        
        Scanner  user = new Scanner(System.in);
        int num = user.nextInt();
        switch(num){
            case 2:
                System.out.println("win");
                //break;
            case 3:
            case 1:
                System.out.println("Lose");
                break;
                default:
                    System.out.println("error");
        }//end switch
        System.out.println("Ending");
        
       
        /*
        if(num == 1){
            System.out.println("Lose");
        }else if(num == 2){
            System.out.println("Win");
        }else if(num == 3){
            System.out.println("Lose");
        }else{
            System.out.println("p enter from 1 to 3");
        }
        */
         /*
         int c = 0;
         do{
             System.out.println("Hello ");
             //c = c+ 1;
             c++;
         }while(c < 5)
         */
         String[] courses = {"Android","Java","Laravel API","PHP"};
         int i = 0;
         do{
             System.out.println(courses[i]);
             i++;
         }while(i < 4);
         
    }
    
}
