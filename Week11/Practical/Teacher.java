package week11;


public class Teacher {
    //1- attributes = data
    private String name,department;
    private int age;
    
    //create constructor
    public Teacher(String name,int age, String department){
        if(age > 0){
            this.age = age;
        }
        this.name  = name;
        this.department = department;
        //System.out.println("Hi, object created");
    }
    //2- methods
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}
