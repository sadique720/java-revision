class Student1{
    int age;
    String name;
    String address;

    Student1(String name, String address){
        this.name = name;
        this.address = address;
    }



}
public class Constructor {

    public static void main(String args[]) {


        Student1 s1 = new Student1("sadique", "mumbai");

        s1.age =  23;

        System.out.println("name : " + s1.name);
        System.out.println("adess : " + s1.address);
        System.out.println("age : " + s1.age);

    }
}
