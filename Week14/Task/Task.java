/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;

/**
 *
 * @author graphics
 */
public class Task {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        
        teacher1.setAddress("cairo ");
        teacher1.setAge(20);
        teacher1.setDepartment("it");
        teacher1.setMobile("011");
        teacher1.setName("me");
        System.out.println(teacher1.getAddress()+"\t"+teacher1.getDepartment()+"\t"+teacher1.getMobile()+"\t"+teacher1.getName());
        
        
    }
    
    
}
