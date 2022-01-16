class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}
class Cat extends Animal {
    void meow() {
        System.out.println("meowing...");
    }
}

public class HierarchicalInheritance {
    public static void main (String args[]) {
        Cat c = new Cat();
        c.meow();
        c.eat();
        //c.bark(); //it will give error
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}
