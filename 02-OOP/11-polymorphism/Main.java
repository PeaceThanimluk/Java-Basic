/*
Polymorphism คือ Polymorphism คือการที่ Object ต่างชนิดกันสามารถถูกใช้งานผ่าน Parent type เดียวกัน และแต่ละ Object สามารถมีพฤติกรรมที่แตกต่างกันได้ เช่นการ Override Method
มันคือการนำ Override มาใช้ แต่class ยังเป็น concrete class ไม่ใช่มีแต่โครงแบบ abstract class
*/

class Animal {
    void speak() {
        System.out.println("Animal Speak!");
    }
}

class Dog extends Animal {
    
    @Override
    void speak() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {

    @Override
    void speak() {
        System.out.println("Meow!");
    }

}

public class Main {

    // USEFUL METHOD
    public static void makeSound(Animal animal) { // เป็น parameter ที่รับ class/object มา
        animal.speak();
    }

    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        //Polymorphism
        animal1.speak();
        animal2.speak(); //method ชื่อเหมือนกัน แต่ behavior ต่างกัน

        makeSound(animal2);

    }
}
