///SUPER CLASS
class Human {
    //Attribute
    private String Name;
    private int Age;

    public Human(String Name, int Age) {
        this.Name = Name;
        this.Age = Age;
    }

    public String getName() {
        return this.Name;
    }

    public int getAge() {
        return  this.Age;
    }

    public void Walk() {
        System.out.println(this.Name + " is walking!");
    }

    public void Eat() {
        System.out.println(this.Name + " is Eating!");
    }

}

///SUB CLASS
class BaBy extends Human {
    public BaBy(String Name, int Age) {
        super(Name, Age);
    }

    //Method Ovrriding เป็นการเอา behavior ของ SUPERCLASS มาปรับใหม่เป็นBEHAVOIR ที่สอดคล้องกับตัวเอง ใช้ชื่อเดิม
    @Override
    public void Walk() {
        System.out.println(getName() + " is crawling");
    }

    @Override  //เป็นการบอก compiler ว่าจะ override 
    public void Eat() {
        System.out.println(getName() + " is Skibiding");
    }

}


public class Main {
    public static void main(String[] args) {
        //Create Baby Class entends from Human class
        BaBy Baby1 = new BaBy("Ball", 1);

        //Use Method
        Baby1.Walk();
    }
}
