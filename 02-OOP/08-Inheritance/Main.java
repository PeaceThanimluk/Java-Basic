//SUPER CLASS
class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public String getName() {
        return  this.name;
    }

    void Eat(){
        System.out.println(this.name + " is eating!");
    }

    void Sleep() {
        System.out.println(this.name + " is sleeping!");
    }
}

//SUB CLASS
class Dog extends Animal {

    public Dog(String name){
        super(name); //this.name = name; inherit attribute ของ superclassมา
    }

    void Bark() {
        System.out.println(getName() + " is barking");
    }

}


public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Lucky");
        dog1.Bark();
        dog1.Eat(); //เอา Method ของ Superclass มาใช้ได้
        
    }    
}
