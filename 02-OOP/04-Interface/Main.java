/* Interface = กำหนดว่า class ที่ implement interface นั้นๆ
    จะต้องมี Method อะไรบ้าง แต่ไม่ได้ระบุว่า Method เหล่านั้นจะทำงานอย่างไร

*/

//ถ้า class ไหนจะ implement interface นี้ต้องมี methodที่กำหนด
interface Human {
    void Speak();
    void Walk();
}

/**
 * Feeling
 */
interface Feeling {
    void Happy();
}

//เราสามารถ implement หลาย interface ได้
class User implements Human, Feeling {
    // Attribute -> when create object must set value of attribute
    String user_name;
    Integer user_id;

    public User(String Username, int Id){
        this.user_name = Username;
        this.user_id = Id;
    }

    // Method of class
    void showStatus() {
        System.out.println("Username : " + this.user_name);
        System.out.println("Id : " + this.user_id);
    }

    private void showMessage(String message){
        System.out.println(this.user_name + " " + message);
    }

    public void Speak(){
        showMessage("Is speaking");
    }

    public void Walk(){
        showMessage("Is walking");
    }

    public  void Happy(){
        showMessage("Is happy");
    }

}

public class Main {
    public static void main(String[] args) {
        User User1 = new User("Skibidy", 0);

        User1.Speak();
    }
}
