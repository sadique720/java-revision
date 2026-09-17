class Student{

    String name;
    String email;
    String course;
    int phone;
    int roll_no;
}

public class StudentFirstClass {

    public static void main(String args[]) {

        Student s1 = new Student();
        s1.name = "Sadique shaikh";
        s1.email = "Sadique@gmail.com";
        s1.course = "java";
        s1.phone = 720879445;

        System.out.printf(s1.name,s1.phone);
//        System.out.println(s1.name,s1.phone); it gives error

        Student s2 = new Student(); // you can create multiple objects of the calss

        s1.name = "Sameer Shaikh";
        s1.course = "Python";
        s1.phone = 720879445;
        System.out.println(s1.name);


    }
}
