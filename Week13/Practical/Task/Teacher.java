
package week13;

import graphics.Photoshop;


public class Teacher extends Person{
    private String department;

    public String getDepartment() {
        Photoshop photo = new Photoshop();
       
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    /*
    @Override
    public String getName() {
        return "Teacher name is " + super.getName(); //To change body of generated methods, choose Tools | Templates.
    }
    */
    
    
    
}
