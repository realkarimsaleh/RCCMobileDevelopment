package week12;


public class Week12 {

    
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Alia Ali");
        s1.setAge(34);
        s1.setAddress("Cairo");
        System.out.println(s1.getName()+" "+s1.getAddress());
        Teacher t1 = new Teacher();
        t1.setName("Sara Khaled");
        System.out.println(s1.getName());
        System.out.println(t1.getName());
    }
    
}
