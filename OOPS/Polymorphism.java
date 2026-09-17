class Animal {
    void sound() {
        System.out.println("Animal sound....");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("bawoo bawoo...");

    }
}class Cat extends Animal {
    void sound() {
        System.out.println("meawooo...");

    }
}class Caw extends Animal {
    void sound() {
        System.out.println("baaaa...");

    }
}

public class Polymorphism {

    public static void main(String args[]) {

        Animal a;

        a =new Dog();
        a.sound();

        a =new Cat();
        a.sound();

        a =new Caw();
        a.sound();

    }
}
