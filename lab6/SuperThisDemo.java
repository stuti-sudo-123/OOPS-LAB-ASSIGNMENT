
class Animal {
    String name;
    String sound;
    int age;
    Animal(String name, String sound, int age) {
        this.name  = name;   
        this.sound = sound;
        this.age   = age;
        System.out.println("Animal constructor called");
    }
    void display() {
        System.out.println("Name  : " + name);
        System.out.println("Sound : " + sound);
        System.out.println("Age   : " + age);
    }
}
class Dog extends Animal {
    String breed;
    Dog(String name, int age, String breed) {
        super(name, "Bark!", age);
        System.out.println("Dog constructor called");
        this.breed = breed;
    }
    void display() {

        super.display();
        System.out.println("Breed : " + breed);
    }
}

public class SuperThisDemo {
    public static void main(String[] args) {
     Dog d= new Dog("Strawberry",7,"Poodle");
     System.out.println("Using super class display method and overriding it");
     d.display();
    }
}
