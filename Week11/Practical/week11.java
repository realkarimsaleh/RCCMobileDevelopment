
package week11;

import java.util.Scanner;

public class Week11 {

    
    public static void main(String[] args) {
        /*
        Teacher t1 = new Teacher();
        t1.setName("Amera Khaled");
        t1.setAge(20);
        t1.setDepartment("Arabic");
        
        System.out.println(t1.getName() + " "+ t1.getDepartment());
        
        Teacher t2 = new Teacher();
        t2.setName("Amer Mohamed");
        t2.setAge(23);
        t2.setDepartment("English");
        
        System.out.println(t2.getName() + " "+ t2.getDepartment());
        */
        Scanner s = new Scanner(System.in);
        System.out.println("Enter teacher name");
        String t1Name = s.nextLine();
        System.out.println("Enter teacher age");
        int t1Age = s.nextInt();
        Teacher t1 = new Teacher(t1Name,t1Age,"Arabic");
        Teacher t2 = new Teacher("Amer Mohamed",23,"English");
        t1.setAge(33);
        //t1.setName(name);
        System.out.println(t1.getName() + " "+ t1.getDepartment());
        System.out.println(t2.getName() + " "+ t2.getDepartment());
        
    }
    
}
