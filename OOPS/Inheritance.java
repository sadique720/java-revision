import java.sql.SQLOutput;

class Person {

    String name;
    int age;
    String email;

    Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    void showDetails() {
        System.out.println("Name :" + this.name);
        System.out.println("Age :" + this.age);
        System.out.println("Email :" + this.email);
    }
}

class Student2 extends Person{

    Student2(String name, int age, String email) {
        super(name, age, email);
    }
}

class Employee extends Person{
    Employee(String name, int age, String email) {
        super(name, age, email);
    }


}
public class Inheritance {

    public static void main(String args[]) {

        Student2 s1 = new Student2("Sadique", 20, "sadique@gmail.com");
        s1.showDetails();
        System.out.println();
        Employee e1 = new Employee("Aamir", 23, "aamir@gmail.com");
        e1.showDetails();

    }

}
