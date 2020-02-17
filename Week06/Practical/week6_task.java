
package week6_task;

import java.util.Scanner;


public class Week6_task {

    
    public static void main(String[] args) {
        System.out.println("Enter the first number");
        Scanner input = new Scanner(System.in);
        int fn = input.nextInt();
        System.out.println("Enter second number");
        int sn = input.nextInt();
        //5 + 3 = 8
        //System.out.println("2"+ 2);
        System.out.println("Enter the operation(+,-,*,/)");
        String op = input.next();
        //System.out.println("Enter 1 = +, 2 = -, 3 = *");
        //int op2 = input.nextInt();
        //System.out.println(op2);
        switch(op){
            case "+":
                
                break;
            case "-":
                break;
            case "*":
                break;
        }
        System.out.println(op);
        //System.out.println(fn + " + " + sn + " = " + (fn+sn));
    }
    
}
